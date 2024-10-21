package ClassWork_028.car_garage.ait.cars.test;

import ClassWork_028.car_garage.ait.cars.dao.Garage;
import ClassWork_028.car_garage.ait.cars.dao.GarageImpl;
import ClassWork_028.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class GarageImplTest {

    private Garage garage;
    private Car[] autos;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        autos = new Car[4];
        autos[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        autos[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        autos[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        autos[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        //TODO  add autos to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(autos[i]);
        }
    }

    @Test
    void addCarTest() {

    }

    @Test
    void removeCarTest() {
    }

    @Test
    void findCarByRegNumberTest() {


    }

    @Test
    void findCarsByModelTest() {
        Car[]expected = {autos[0],autos[2]};
        Car[]actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected,actual);
    }

    @Test
    void findCarsCompanyTest() {
    }

    @Test
    void findCarsByEngineTest() {
    }

    @Test
    void findCarsByColorTest() {
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