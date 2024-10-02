package Fremd.homework_14.j_reise;
// 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;

public class happyDumpling {

    public static void main(String[] args) {
        // Варим 30 пельмешек, каждая по 40 грамм в кастрюльке (массиве)
        int[] pelmeshki = new int[30];

        for (int i = 0; i < pelmeshki.length; i++) {
            pelmeshki[i] =40; //

        } // end of fori for array

        // Метод для добавления монеты.
        // Нужен Random и случайный поиск индекса и добавляем 15 грамм
        Random random = new Random();
        int indexSearch = random.nextInt(30);
        pelmeshki[indexSearch] += 15;

        // Метод для поиска пельменя большего по весу

        for (int i = 0; i < pelmeshki.length; i++) {
            if (pelmeshki[i] != 40) { // Ищем пельмень, который отличается по весу
                System.out.println(" Счастливый пельмень оказался " + i + " по счёту ");

            } // end of IF

        } // end of fori

    } // end of main

} // end of class
