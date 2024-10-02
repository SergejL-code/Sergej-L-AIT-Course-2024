package Fremd.homework_14.g_adler;

import java.util.Random;

//Задача 3. ()* Найти в Интернете алгоритм selection sort. https://www.geeksforgeeks.org/selection-sort/ Задать массив из случайных целых чисел.
//Реализовать метод, получающий на вход массив и сортирующий его по алгоритму selection sort.
public class Task3_27_09 {
    public static void main(String[] args) {
        int [] array = new int [5];//вводим массив например на 5 элементов
        Random random = new Random();//вводим генератор случайных цифр
        for (int i = 0; i < array.length; i++) {//вводим цикл for для заполнения массива случайными цифрами
            array[i] = random.nextInt(10)+1;//случайные цифры от 0 до 9, +1 - чтобы случайные цифры были от 1 до 10
        }
        ArrayMethods.printArray(array);//выводим исходный массив методом printArray из классной работы

        ArrayMethods.selectionSort(array);// в "библеотеке" методов в классной работе создаем метод сортировки от меньшего к большему selectionSort

        ArrayMethods.printArray(array); //выводим сортированный массив методом printArray из классной работы
    }//end of main
}//end of class
