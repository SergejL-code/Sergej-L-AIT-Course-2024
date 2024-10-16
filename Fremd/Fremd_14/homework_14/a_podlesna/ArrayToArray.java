package Fremd14.homework_14.a_podlesna;

// Часть1. Заполните массив целыми числами от 1 до 100.
// Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
// Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import java.util.Random;
import java.util.Scanner;

public class ArrayToArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input primary array size: ");     // took the size of the array
        int primaryArraySize = scanner.nextInt();

        int[] primaryArray = new int[primaryArraySize];     // created the primary array
        int ArrayTemp = 0;
        for (int i = 0; i < primaryArraySize; i++)          // filled the array
        {
            System.out.printf("Input the %d element of the array (1 - 100): ", i + 1);
            ArrayTemp = scanner.nextInt();
            if (ArrayTemp >= 1 && ArrayTemp <= 100) primaryArray[i] = ArrayTemp;
            else
            {
                System.out.println("Error 401, try again...");
                i--;
            }
        }

        printArray(primaryArray);                                          // printing primary array

        int[] secondArray = copyArray(primaryArray, primaryArraySize + 1); // created the second array

        printArray(copyArray(primaryArray, primaryArraySize + 1));    // printing second array

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.print("Random number: " + randomNumber);
        int randomIndex = random.nextInt(secondArray.length);
        System.out.print("\nRandom index in second array: " + randomIndex + "\n");

        printArray(insertNumberInArray(secondArray, randomNumber, randomIndex)); // insert the number in the array and printing

        System.out.printf("Number %d has an index in the array: %d", randomNumber, searchNumberInArray(secondArray, randomNumber));
    }

    // printing of any array

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("\n---------------------------------------------");
    }

    // copying one array to another

    public static int[] copyArray(int[] primaryArray, int length)
    {
        int[] secondArray = new int[length];

        for (int i = 0; i < primaryArray.length; i++)
        {
            secondArray[i] = primaryArray[i];
        }
        return secondArray;
    }

    // inserting an element into an array by index

    public static int[] insertNumberInArray(int[] array, int number, int index)
    {
        for (int i = array.length - 1; i > index; i--)
        {
            array[i] = array[i - 1];
        }
        array[index] = number;
        return array;
    }

    // element search in an array

    public static int searchNumberInArray(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number) return i;
        }
        return -1;
    }
}
