package ClassWork_013;

import Array_methods.ArrayMethods;

public class BinarySaerchWithIndex {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println(ArrayMethods.linearSearch(myArray, 10));
        System.out.println(ArrayMethods.linearSearch(myArray, 100));
        System.out.println(ArrayMethods.linearSearch(myArray, 40));

        System.out.println("-------------------------------------------");

        int index = ArrayMethods.binarySearchvonKleinZuGross(myArray, 20);
        System.out.println(index);

    }
}
