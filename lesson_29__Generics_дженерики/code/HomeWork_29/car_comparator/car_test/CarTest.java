package HomeWork_29.car_comparator.car_test;

import HomeWork_29.car_comparator.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {
Car[]autos;
    @BeforeEach
    void setUp() {
        autos=new Car[6];
        autos[0]=new Car("Camry","White",28045,2015);
        autos[1]=new Car("3 Series","Black Metallik",42000,2020);
        autos[2]=new Car("Q5","Grey",48100,2012);
        autos[3]=new Car("Model 3","Red",38005,2023);
        autos[4]=new Car("GLC","Blue",55000,2024);
        autos[5]=new Car("KonaElektro","Darkgreay",45555,2021);
    }

    @Test
    void sortCarYearOfManufactureTest() {
        System.out.println("=========================List autos as is===================================");
        printAutos();//print befor sorting cars
        Arrays.sort(autos);//sorting
        System.out.println("===================List autos sorted by year============================");
        printAutos();//print by YearOfManufacture
    }
    @Test
    void sortCarsByPriceTest(){
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car auto1, Car auto2) {
                //      return (int) (w1.getPrice()-w2.getPrice());
                return Double.compare(auto1.getPrice(), auto2.getPrice());
            }
        };
        System.out.println("=========================List autos as is===================================");
        printAutos();//print as is
        Arrays.sort(autos,comparatorByPrice);//sorting by Price
        System.out.println("===================List autos sorted by Price============================");
        printAutos();//print by age
    }

    @Test
    void printAutos() {
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
    }
    @Test
    void sortCarByModelTest(){
        Comparator<Car>comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car auto1, Car auto2) {
                return auto1.getModel().compareTo(auto2.getModel());
            }


        };
        System.out.println("=========================List autos as is===================================");
        printAutos();//print as is
        Arrays.sort(autos,comparatorByModel);//sorting by Price
        System.out.println("===================List wines sorted by Model============================");
        printAutos();//print after sorting
    }
    @Test
    void sortCarByColorTest(){
        Comparator<Car>comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car auto1, Car auto2) {
                return auto1.getColor().compareTo(auto2.getColor());
            }


        };
        System.out.println("=========================List autos as is===================================");
        printAutos();//print as is
        Arrays.sort(autos,comparatorByColor);//sorting by Price
        System.out.println("===================List wines sorted by Model============================");
        printAutos();//print after sorting

        }
}//end of class