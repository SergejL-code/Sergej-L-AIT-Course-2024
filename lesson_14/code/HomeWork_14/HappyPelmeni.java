package HomeWork_14;
//Problem 2. A problem about finding a "lucky dumpling". The hostess made 30 dumplings for her guests.
// She put a coin in one of the dumplings, which increases the weight of the dumpling by 15 grams.
// Write a program that searches for a lucky dumpling.
//---------------------------------------------------------------------------------------------------------
//Задача 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету,
// которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import Array_methods.ArrayMethods;

import java.util.Random;

public class HappyPelmeni {

    public static void main(String[] args) {

        Random random = new Random();

        int happypelmen = 15;//gramm: Extra Weight for a Happy Pelmen

        int[] weightPelmeni = ArrayMethods.fillArray(10, 15, 30);//Create an array for Pelmeni and
        // fill it with random values from 30 to 60 grams

        int happyPelmen = random.nextInt(weightPelmeni.length);//Random Index for Happy Pelmen

        weightPelmeni[happyPelmen] += happypelmen;// Add 15 gramm for Happy Pelmen


        for (int i = 0; i < weightPelmeni.length; i++) {  //search Happy pelmen
            if (weightPelmeni[i] > 30) {
                System.out.println("Happy  found!");
                System.out.println("Index the happy пельменя: " + i);
                System.out.println("Weight the happy пельменя: " + weightPelmeni[i] + " gramm");

            } //end of if

        }//end of fori
        System.out.println(" Eat another one... ");
    }//end of main
}   //end of class


