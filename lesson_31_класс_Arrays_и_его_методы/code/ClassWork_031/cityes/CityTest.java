package ClassWork_031.cityes;

/*City("Denver", 600_000);
City("Boston", 670_000);
City("Chicago", 2_700_000);
City("Atlanta", 470_000);
City("New York", 8_500_000);
City("Dallas", 1_300_000);
Распечатать в отсортированном виде.
Есть ли в списке городов город с населением 1.2 млн человек?
Отсортируйте список по алфавиту.
Есть ли в списке город по имени Chicago? Какой он имеет номер в списке
Скопируйте массив в другой, имеющий в 2 раза большую длину.
Отсортируйте полученный массив.
Имеется ли в списке городов город Salem?
"Salem", 690_000
Вставьте город Salem в список, сохранив порядок сортировки по населению.
Проверьте работу метода System.arraycopy, скопировав часть массива.
Проверьте работу метода Arrays.copyOfRange
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);

    }

    private void printArray(Object[] array, String titelOfReport) {
        System.out.println("=================" + titelOfReport + "====================");
        for (Object stadt : array) {
            System.out.println(stadt);
        }
    }
//    Распечатать в отсортированном виде.
//    Есть ли в списке городов город с населением 1.2 млн человек?
//    Отсортируйте список по алфавиту.
//    Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

    @Test
    public void comparableTest() {
        printArray(cities, ": List of cities as is");
        Arrays.sort(cities);
        printArray(cities, "List of cities sorted by population");
        City pattern = new City(null, 1_200_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println(index);

    }

    @Test
    void comparatorByNameTest() {
        Comparator<City> comparatorbyCityName = new Comparator<City>() {
            @Override
            public int compare(City stadt1, City stadt2) {
                return stadt1.getName().compareTo(stadt2.getName());
            }
        };
        Arrays.sort(cities, comparatorbyCityName);
        printArray(cities, "List of cities sorted by Name");
        City pattern = new City("Atlanta", 0);
        int index = Arrays.binarySearch(cities, pattern, comparatorbyCityName);
        if (index >= 0) {
            System.out.println(" Find city " + pattern.getName() + " on index: " + index);
        } else {
            System.out.println("City " + pattern.getName() + "did not find, but it could be on index " + (-index - 1));
        }
    }
//    Скопируйте массив в другой, имеющий в 2 раза большую длину.
//    Отсортируйте полученный массив.
//    Имеется ли в списке городов город Salem?
//            "Salem", 690_000

    @Test
    void testArrayCopy() {

        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy as is ");
        System.out.println(citiesCopy.length);
        Comparator<City> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort(citiesCopy, comparatorByName);
        //print
        printArray(citiesCopy, "Citiescopy after sorting by name ");

        City pattern = new City("Salem", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparatorByName);

        System.out.println(index);
    }

    //Вставьте город Salem в список, сохранив порядок сортировки по населению.(!)
    //вставляем в имеющися список

    @Test
    void testInsertKeepSorting() {
        Arrays.sort(cities);// by default
        printArray(cities, "Nativ sorting");
        //increase up to seven
        City[] citiesCopySeven = Arrays.copyOf(cities, cities.length + 1);
        City city = new City("Dallas", 1_300_000);
        int index = Arrays.binarySearch(citiesCopySeven, 0, citiesCopySeven.length - 1, city);
        index = index >= 0 ? index : -index - 1;// обработка индекса
        //подготовили место для вставки
        System.arraycopy(citiesCopySeven, index, citiesCopySeven, index + 1, citiesCopySeven.length - index - 1);
        citiesCopySeven[index] = city;
        cities = citiesCopySeven; //переопределили ссылку на массив
        printArray(cities,"List with added city");
    }

    //Проверьте работу метода System.arraycopy, скопировав часть массива.
    @Test
    void testSystemArrayCopy(){
        //расширить массив на 2 элемента
        City[]citiesCopyPlus_2 = new City[cities.length+2];
        //копируем имеющейся массив в новый
System.arraycopy(cities,2,citiesCopyPlus_2,0,4);//copy of elements 4, not index
        printArray(cities,"List with original array");
        printArray(citiesCopyPlus_2,"List with copy of array");
    }
    //Проверьте работу метода Arrays.copyOfRange
    @Test
    void  testArrayCopyOfRange(){
        City[]citiesCopy = Arrays.copyOfRange(cities,5,cities.length+3);
        printArray(cities,"List with original(source) array");
        printArray(citiesCopy,"Copy of Range");
    }

}//end of class