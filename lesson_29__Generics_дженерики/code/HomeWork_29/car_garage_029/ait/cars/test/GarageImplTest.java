package HomeWork_29.car_garage_029.ait.cars.test;

import HomeWork_29.car_garage_029.ait.cars.dao.Garage;
import HomeWork_29.car_garage_029.ait.cars.dao.GarageImpl;
import HomeWork_29.car_garage_029.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GarageImplTest {

    private Garage garage;
    private Car[] autos;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        autos = new Car[4];
        autos[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        autos[1] = new Car("Number2", "Model2", "Company2", 2.5, "Green");
        autos[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        autos[3] = new Car("Number4", "Model4", "Company3", 2.0, "Green");

        //TODO  add autos to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(autos[i]);
        }
    }

    @Test
    void addCarTest() {
        //check size
        assertEquals(4, garage.size());
        //can#t add null
        assertFalse(garage.addCar(null));
        //can't add duplicate
        assertFalse(garage.addCar(autos[1]));
        //can add new one a car
        Car newCar = new Car("Number8", "N7", "L7", 160, "blau");
        assertTrue(garage.addCar(newCar));
        //check size
        assertEquals(5, garage.size());
        //can't add one more
        Car nextCar = new Car("8", "N6", "L6", 160, "pur");
        assertFalse(garage.addCar(nextCar));
    }

    @Test
    void removeCarTest() {//can remove existed
        assertEquals(autos[0], garage.removeCar("Number1"));
        //check size
        assertEquals(3, garage.size());
        //can't remove absent
        assertNull(garage.removeCar("Number10"));
    }

   @Test
    void findCarByRegNumberTest() {
        //find existed
        assertEquals(autos[1],garage.findCarByRegNumber("Number2"));
        //find absent
        assertNull(garage.findCarByRegNumber("Number9"));

    }

    @Test
    void findCarsByModelTest() {
        Car[]expected = {autos[0],autos[2]};
        Car[]actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected,actual);
    }

    @Test
    void findCarsCompanyTest() {
        Car[]expected = {autos[1],autos[2]};
        Car[] aktual = garage.findCarsCompany("Company2");
        assertArrayEquals(expected,aktual);
    }

    @Test
    void findCarsByEngineTest() {
        Car[]expected = {autos[0],autos[2],autos[3]};
        Car[]actual = garage.findCarsByEngine(1,2);
        assertArrayEquals(expected,actual);
    }

    @Test
    void findCarsByColorTest() {
        Car[]expected = {autos[1],autos[3]};
        Car[] actual = garage.findCarsByColor(("green"));
    }
    @Test
    void sizeTest(){
        assertEquals(4,garage.size());
    }
    @Test
    void  printCarsTest(){
        garage.printCars();
    }


}// end of car