package Fremd14.homework_14.j_reise;

// Часть1.
// Заполните массив целыми числами от 1 до 100.
// Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.

//Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.

//Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import java.util.Arrays;
import java.util.Random;

public class McKoffe {

    public static void main(String[] args) {

        // Задаём численный массив от 1 до 100

        int[] firstArray = new int[100];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        System.out.println("Начальный массив: " + Arrays.toString(firstArray));

        // Создаём второй массив от 1 до 100 +1

        int[] secondArray = new int[firstArray.length + 1];

        // Копируем первый массив во второй
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);

        // Добавляем случайное число
        // Вставляем случайное число в случайную позицию
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int randomIndex = random.nextInt(secondArray.length);

        for (int i = secondArray.length - 1; i > randomIndex; i--) {
            secondArray[i] = secondArray[i - 1];

        }

        secondArray[randomIndex] = randomNumber;
        System.out.println("Новый массив с добавленным числом: " + Arrays.toString(secondArray));

        // Поиск добавленного числа
        int addedNumber = findAddedNumber(firstArray, secondArray);
        System.out.println("Добавленное число = " + addedNumber);

    } // end of main

    // Метод для нахождения добавленного числа
    public static int findAddedNumber(int[] originalArray, int[] newArray) {

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != newArray[i]) {
                return newArray[i]; // Возвращаем первое несоответствие
            }
        }
        // Если все элементы совпадают, то добавленный элемент - последний
        return newArray[newArray.length - 1];

    } // end of

} // end of class
