package ClassWork_029.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class WineTest {
    Wine[] wines;


    @BeforeEach
    void setUp() {
        wines = new Wine[5];
        wines[0] = new Wine("typ1", "AAA", 2021, 6);
        wines[1] = new Wine("typ2", "CCC", 2024, 3);
        wines[2] = new Wine("typ3", "XXX", 2022, 5);
        wines[3] = new Wine("typ1", "OOO", 2015, 7);
        wines[4] = new Wine("typ2", "SSS", 2000, 20);

    }

    @Test
    void sortWineByAgeTest() {
        System.out.println("=========================List wines as is===================================");
        printWines();//print as is
        Arrays.sort(wines);//sorting
        System.out.println("===================List wines sorted by age============================");
        printWines();//print by age
    }
    @Test
    void sortWineByPriceTest(){
        Comparator<Wine>comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
          //      return (int) (w1.getPrice()-w2.getPrice());
                return Double.compare(w1.getPrice(), w2.getPrice());
            }
        };
        System.out.println("=========================List wines as is===================================");
        printWines();//print as is
        Arrays.sort(wines,comparatorByPrice);//sorting by Price
        System.out.println("===================List wines sorted by Price============================");
        printWines();//print by age
    }

    @Test
    void printWines() {
        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }
    @Test
    void sortWineByTitleTest(){
        Comparator<Wine>comparatorbyTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitel().compareTo(w2.getTitel());
            }
        };
        System.out.println("=========================List wines as is===================================");
        printWines();//print as is
        Arrays.sort(wines,comparatorbyTitle);//sorting by Price
        System.out.println("===================List wines sorted by Titel============================");
        printWines();//print after sorting
    }
}//end of class