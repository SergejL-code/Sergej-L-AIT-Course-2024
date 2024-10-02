package ClassWork_012;

import Array_methods.ArrayMethods;

import java.util.Scanner;

public class SearchNumberWithScanner {
    public static void main(String[] args) {


            int[] myArray = ArrayMethods.fillArray(-10, 10, 20);

            ArrayMethods.printArray(myArray);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number for searching: ");
            int n = scanner.nextInt();

            boolean isInArray = ArrayMethods.searchInArray(myArray, n);
            System.out.println("Number " + n + " is in array: " + isInArray);
    }

}
