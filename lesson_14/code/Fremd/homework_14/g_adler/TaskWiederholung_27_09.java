package Fremd.homework_14.g_adler;

//Задача 1. Найти произведение всех двузначных нечетных чисел кратных 17.

import java.util.Scanner;

//Задача 2. В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
//Использовать цикл for.
public class TaskWiederholung_27_09 {
    public static void main(String[] args) {
//Задача 1. Найти произведение всех двузначных нечетных чисел кратных 17.
        //это числа в интервале от 10 до 99

        int number = 1;
        boolean found = false;  // Флаг для проверки, найдутся ли такие числа

        for (int i = 10; i < 100; i++) { // Проверяем циклом все двузначные числа от 10 до 99
            if (i % 2 != 0 && i % 17 == 0) {// Проверяем, является ли число нечетным (не делится на 2 без остатка - i % 2 != 0)и кратным 17 (т.е. остаток после деления = 0 - i % 17 == 0)
                number *= i;  // Умножаем на текущее произведение
                found = true;//правда
                System.out.println("Number: " + i);
            }
        }

        if (found) { // Если хотя бы одно число было найдено
            System.out.println("Sum of all numbers: " + number);
        } else {//если ничего не найдено
            System.out.println("No matching numbers have been found.");
        }

        System.out.println("===========================================================");


//Задача 2. В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
//Использовать цикл for.

        Scanner scanner = new Scanner(System.in);//вводим сканер, чтобы можно было ввести сумму и срок с клавы

        System.out.print("Введите сумму вклада: ");   // Предлагаем пользователю ввести желаемую сумму вклада
        double s = scanner.nextDouble();  // Сумма вклада с типом double, т.к. есть копейки и далее будет добавлен процент по вкладу
        System.out.print("Введите количество лет (n): ");// Предлагаем пользователю ввести желаеммый срок
        int n = scanner.nextInt();  // Количество лет

        // Процент по вкладу
        double percent = 0.03;  // 3% годовых

        for (int i = 1; i <= n; i++) {// Вычисляем сумму вклада с помощью цикла for, цикл выполняется n раз, где n — это количество лет.
            s += s * percent;  // Прибавляем 3% к текущей сумме вклада каждый год
        }

        // Вывод результата
        System.out.printf("Сумма вклада через %d лет составит: %.2f рублей%n", n, s);//Итоговая сумма вклада. ** %d и %.2f - % % — это символ, обозначающий начало форматирования; d — спецификатор для вывода целого числа (от английского слова "decimal", т.е. десятичное число); .2 — это указание, что нужно вывести число с точностью до двух знаков после запятой; f — это спецификатор для вывода числа в формате с плавающей точкой (то есть float или double).**

    }//end of main

}//end of class

