package Fremd.homework_14.a_podlesna;

// Найти в Интернете алгоритм selection sort.
// Задать массив из случайных целых чисел.
// Реализовать метод, получающий на вход массив и сортирующий его по алгоритму selection sort.

import java.util.Random;

public class SelectionSort
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] randomArray = new int[30];

        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = random.nextInt(100);
        }

        ArrayToArray.printArray(randomArray);  // печать рандомного массива элементов

        ArrayToArray.printArray(selectionSortArray(randomArray)); // печать отсортированного массива элементов
    }

    public static int[] selectionSortArray(int[] array)
    {
        int value = 0;
        for (int left = 0; left < array.length; left++)
        {
            int minIndex = left;
            for (int i = left; i < array.length; i++)
            {
                if (array[i] < array[minIndex])
                    minIndex = i;
            }
            value = array[left];
            array[left] = array[minIndex];
            array[minIndex] = value;
        }
        return array;
    }
}
