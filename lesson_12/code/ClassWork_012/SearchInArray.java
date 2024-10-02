package ClassWork_012;

//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//Запросите у пользователя какое-то натуральное число.
//Определите, есть ли это число в массиве.
//Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
//ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        //fill in array numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
            //print array numbers
        printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positiv integer number: ");
        int n = scanner.nextInt();
        //    call of Method
        boolean isInArray = searchInArray(numbers, n);

        System.out.println(" Number " + n + " is in array: " + isInArray);//printing nach  Method searchInArray


    }//end of main

    private static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }//end of Method searchInArray

    // printArray
    public static void printArray(int[] array_1) {
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i] + "  ");
        }
        System.out.println();
        System.out.println("----------------------------------------");
    }//end of method printArray
}//end of class
