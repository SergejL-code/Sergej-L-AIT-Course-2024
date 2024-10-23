package ClassWork_030.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

 /* - John, 182, 82.3, 91
- Peter, 175, 77.1, 75
 -Robin, 162, 55.1, 91
- Mary, 159, 55.1, 91
- Ann, 162, 55, 88*/


class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88),
                new Soldier("John", 173, 82, 80)
        };
    } // end of method
    //    - отсортировать солдат "естественным" образом - по росту
    @Test
    void testNativeSorting() {
        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers); // native, by default
        System.out.println("-------------- Print after native sorting --------------");
        printArray(soldiers);
    }
    //- отсортировать по имени
    @Test
    void testSortingByName() {
        Comparator<Soldier> comparatorName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getName().compareTo(o2.getName());
                //  return - o1.getName().compareTo(o2.getName());//reverse sorting
                //  return o2.getName().compareTo(o1.getName());// reverse sorting
            }
        };

        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorName); //
        System.out.println("-------------- Print after  sorting by name --------------");

        printArray(soldiers);

    }


    // по весу
    @Test
    void testSortingByWeight() {
        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers,(w1,w2)-> Double.compare(w2.getWeight(), w1.getWeight()));
        System.out.println("-------------- Print after  sorting by Weight --------------");
        printArray(soldiers);
    }
// two and more factors for sorting

    @Test
    void testByNameAndHeight() {
        Comparator<Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res != 0 ? res : Integer.compare(o1.getHeight(), o2.getHeight());

            }
        };

        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers, comparatorNameAndHeight);
        System.out.println("-------------- Print after  sorting by Name and Height --------------");
        printArray(soldiers);
    }

    //по значению profile and Height
    @Test
    void testSortSoldiersByProfile() {
        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile


            return res != 0 ? res : Integer.compare(s1.getHeight(), s2.getHeight());//sort by Height

        });
        System.out.println("-------------- Print after  sorting by Profile and Height --------------");
        printArray(soldiers);
    }

    //проверить работу метода binarySearch на массив обьектов

    @Test
    void testBinarySearch() {
        System.out.println("-------------- Print as is --------------");
        printArray(soldiers);
        Arrays.sort(soldiers, (w1, w2) -> (w1.getProfile() - w2.getProfile()));
        System.out.println("-------------- Print after  sorting by Profile --------------");
        printArray(soldiers);
        //create object - pattern for searching
        Soldier pattern = new Soldier(null,0,0,91);
        int index =Arrays.binarySearch(soldiers,pattern,(w1, w2) -> (w1.getProfile()- w2.getProfile()));
        System.out.println("Index = " + index);
    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}//end of class