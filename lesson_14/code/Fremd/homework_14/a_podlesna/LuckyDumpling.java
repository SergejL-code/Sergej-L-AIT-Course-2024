package Fremd.homework_14.a_podlesna;

// Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;
import java.util.Scanner;

public class LuckyDumpling
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the weight of a standard Dumpling: ");  // задаем вес обычного пельменя
        int weightStandardDumpling = scanner.nextInt();

        int luckyDumplingIndex = random.nextInt(30);      // произвольное место в массиве "счастливого" пельменя
        System.out.println("Index of lucky Dumpling is: " + luckyDumplingIndex);
        int[] dumplings = new int[30];                          // массив из 30 пельменей

        for (int i = 0; i < dumplings.length; i++)
        {
            dumplings[i] = weightStandardDumpling;  // заполняем массив пельменями по weightStandardDumpling (г)
        }
        dumplings[luckyDumplingIndex] = weightStandardDumpling + 15;

        // Ищем счастливый пельмень вызовом метода поиска элемента из другого класса,
        // передаем массив и элемент поиска
        int luckyDumpling = dumplings[ArrayToArray.searchNumberInArray(dumplings,dumplings[luckyDumplingIndex])];

        System.out.printf("Lucky Dumpling has a weight of %d and is ranked %d in the array", luckyDumpling, ArrayToArray.searchNumberInArray(dumplings,dumplings[luckyDumplingIndex]));
        System.out.println("\n-------------------------------------------------------");

        for (int i = 0; i < dumplings.length; i++)
        {
            System.out.print(dumplings[i]);
            if (i < dumplings.length - 1) System.out.print(", ");
        }

    }
}
