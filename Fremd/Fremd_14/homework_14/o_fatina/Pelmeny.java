package Fremd14.homework_14.o_fatina;

import java.util.Random;

// Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету,
// которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.
public class Pelmeny {

    public static void main(String[] args) {
        int[] pelmeny = new int[30];
        int standartWeight = 10;// пусть все пельмени по 10 грамм, кроме одного
        int luckyWeight = 25;// вес счастливого пельменя

        Random random = new Random();
        int luckyPelmenIndex = random.nextInt(pelmeny.length);//генерируем случайный индекс для счастливого пельменя

        for (int i = 0; i < pelmeny.length; i++){
            pelmeny[i] = standartWeight;
        }
        //устанавливаем вес счастливого пельменя
        pelmeny[luckyPelmenIndex] = luckyWeight;

        //поиск счастливого пельменя

        for (int i = 0; i < pelmeny.length; i++){
            if (pelmeny[i] == luckyWeight){
                System.out.println("Lucky pelmen is: " + (i+1));
                break;
            }
        }

    }
}
