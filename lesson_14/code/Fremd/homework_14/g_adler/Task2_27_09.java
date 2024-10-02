package Fremd.homework_14.g_adler;

import java.util.Random;
//Задача 2. Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
//В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
//Напишите программу, которая ищет счастливый пельмень.
public class Task2_27_09 {
    public static void main(String[] args) {

        int[] pelmeni = new int[30];// Создаем массив для 30 пельменей
        Random random = new Random();// через рандом вводим 30 элементов в массив

        int normalWeight = 20;//предположим, что нормальный вес 1го пельменя 20 грамм

        for (int i = 0; i < pelmeni.length; i++) {// Заполняем массив обычными пельменями (по 20 грамм)
            pelmeni[i] = normalWeight;
        }

        //Один из пельменей должен быть "счастливым" для этого его вес нужно увеличить на 15 грамм.
        int luckyPelmenIndex = random.nextInt(30);  // Случайный индекс пельменя от 0 до 29
        pelmeni[luckyPelmenIndex] = normalWeight + 15;  // Увеличиваем вес счастливого пельменя на 15 грамм

        //Напишите программу, которая ищет счастливый пельмень.

        int foundLuckyPelmenIndex = -1;  // Индекс найденного счастливого пельменя
        for (int i = 0; i < pelmeni.length; i++) {
            if (pelmeni[i] > normalWeight) {//итый пельмень, который по весу будет больше чем другие...->
                foundLuckyPelmenIndex = i;//-> ...будет "счастливым"
            }
        }
        ArrayMethods.printArray(pelmeni);// выводим массив пельменей

        // Выводим результаты
        System.out.println("The happy prlmen is with the index: " + foundLuckyPelmenIndex);
        System.out.println("The weight of a happy pelmen: " + pelmeni[foundLuckyPelmenIndex] + " grams.");
    }


}
