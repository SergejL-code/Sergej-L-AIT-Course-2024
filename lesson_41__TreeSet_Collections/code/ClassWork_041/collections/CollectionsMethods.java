package ClassWork_041.collections;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {

        //-.max, .min
        //- .reverse
        //- .shuffle
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "lemon", "papaya", "orange", "pineapple", "grape", "apricot", "peach", "pear", "banana"));


        for (String frukt : fruits) {
            System.out.print(frukt + " | ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        fruits.forEach(System.out::println);
        System.out.println("************************************* Sorting ****************************************");

        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };
        Collections.sort(fruits);
        fruits.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");

        Comparator<String> fruitComparator2 = String::compareTo;
        Collections.sort(fruits, fruitComparator2);
        fruits.forEach(System.out::println);

        System.out.println("=============================== sorting reverse ===============================");
        Collections.sort(fruits, fruitComparator); // sorting, rewrite collection (элементы переставляются местами)
        fruits.forEach(System.out::println);

        System.out.println("=============================== max ====================================");
        System.out.println(Collections.max(fruits, fruitComparator)); //

        System.out.println("=============================== reverse ===============================");
        Collections.reverse(fruits);
        fruits.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        Collections.sort(fruits.reversed());
       System.out.println(fruits);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("=============================== shuffle ===============================");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);
        System.out.println("============================================");
//        Comparator<String> fruitComparator2 = String::compareTo;
//        Collections.sort(fruits, fruitComparator2);
//        fruits.forEach(System.out::println);


    }
}
