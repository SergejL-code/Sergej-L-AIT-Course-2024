package HomeWork_30.transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/*Do with a set of objects of this class everything that we did in the lesson:
sorting by default
sorting by 2 criteria
searching in an array using Arrays.binarySearch()
-----------------------------------------------------------------------------------------
Выполните с набором объектов этого класса все то, что мы делали на занятии:
сортировка по умолчанию
сортировка по 2-м критериям
поиск в массиве с помощью Arrays.binarySearch()*/
public class VehicleTest {

    Vehicle[] pkws;

    @BeforeEach
    void setUp() {
        pkws = new Vehicle[]{

                new Vehicle("Toyota", 2015, 2.5),
                new Vehicle("Mercedes", 2015, 2.5),
                new Vehicle("Ford", 2018, 1.8),
                new Vehicle("Honda", 2018, 1.8),
                new Vehicle("Ford", 2020, 3.0),
                new Vehicle("BMW", 2017, 2.0),
                new Vehicle("Mercedes", 2019, 3.5)
        };
    }

    // sorting by default
    @Test
    public void NativeSortingTest() {
        System.out.println("-------------- Print as is --------------");
        Vehicle.printArray(pkws);
        Arrays.sort(pkws);
        System.out.println("-------------- Print after default sorting --------------");
        Vehicle.printArray(pkws);
    }

    //sorting by 2 criteria
    @Test
    public void sortingBrandAndEngineTest() {
        Comparator<Vehicle> comparatorBrandAndEngine = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle pkw1, Vehicle pkw2) {
                int res = pkw1.getBrand().compareTo(pkw2.getBrand());
                return res != 0 ? res : Double.compare(pkw1.getEngineVolume(), pkw2.getEngineVolume());
            }
        };
        System.out.println("-------------- Print as is --------------");
        Vehicle.printArray(pkws);
        Arrays.sort(pkws, comparatorBrandAndEngine);
        System.out.println("-------------- Print after BrandAndEngine sorting --------------");
        Vehicle.printArray(pkws);
    }

    //  searching in an array using Arrays.binarySearch()
    @Test
    public void binarySearchTest() {

        System.out.println("-------------- Print as is --------------");
        Vehicle.printArray(pkws);
        Arrays.sort(pkws, (pkw1, pkw2) -> Double.compare(pkw1.getEngineVolume(), pkw2.getEngineVolume()));
        System.out.println("-------------- Print after  sorting by Profile --------------");
        Vehicle.printArray(pkws);
        //create object - pattern for searching
        Vehicle pattern = new Vehicle("Mercedes", 0, 0);
        int index = Arrays.binarySearch(pkws, pattern, (pkw1, pkw2) -> (pkw2.getBrand().compareTo(pkw1.getBrand())));
        System.out.println("Index = " + index);
    }

    }//end of class



