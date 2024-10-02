package Fremd_13;


import Array_methods.ArrayMethods;



// code by Natalia Tikhomirova

//    Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
//    Метод должен создать новый массив длиной newLength.
//    В новый массив должны быть скопированы элементы из входящего массива:
//    Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class MethodOfArray1 {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};              // Исходный массив
        int[] newArray = copyOfArray(array, 3);           // Массив с новой длиной 3

        System.out.print("Новый массив: ");               // Печатаем новый массив
        ArrayMethods.printArray(newArray);                 // вызываем метод printArray

    } // end of main

    // Метод для копирования массива
    public static int[] copyOfArray(int[] array, int newLength) {

        int[] newArray = new int[newLength];           // Создаем новый массив указанной длины
        int lengthToCopy;                               // Определяем минимальную длину для копирования

        if (newLength > array.length) {
            lengthToCopy = array.length;               // Копируем все элементы, если новый массив длиннее
        } else {
            lengthToCopy = newLength;                  // Копируем только newLength элементов
        }

        for (int i = 0; i < lengthToCopy; i++) {       // Копируем элементы из старого массива в новый
            newArray[i] = array[i];
        } // end of for
        return newArray;
    } // end of method
}

