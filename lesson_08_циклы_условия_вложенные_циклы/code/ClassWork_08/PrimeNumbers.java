package ClassWork_08;
//Пользователь вводит натуральное число n. Определите, является ли оно простым.
//Простое число - это такое число, которое делится **ТОЛЬКО** на себя и на 1. 31, 37
//Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
//Обеспечьте защиту от ввода пользователем отрицательных чисел.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int numberX = scanner.nextInt();

        //check correct number
        while (numberX <= 0) {
            System.out.println("Wrong input!");
            System.out.println("Try again please.");
            numberX = scanner.nextInt();
        }//end of cicle

        boolean isPrime = isPrimeNumber(numberX);
        System.out.println(numberX + " is Prime: " + isPrime);
    }//end of main

    private static boolean isPrimeNumber(int numberX) {
        int div = 2;
        while (div < numberX) {
            if (numberX % div == 0) {
                return false;
            }//end of if
            div++;
        }//end of while
        return true;
    }//end of Method
}//end of Class
