package HomeWork_08;
// Determining the time of day.
// Write a program that takes the current hour (0 to 23) and displays a greeting depending on the time of day (morning, afternoon, evening, night).
//Определение времени суток. Напишите программу,
// которая принимает на вход текущий час (от 0 до 23) и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it? (Hour): ");
        int hour = scanner.nextInt();

        while (hour > 0 && hour <= 6) {

            System.out.println("Night fell. Time is " + hour + " o'clock. ");
            break;
        }
        while (hour > 6 && hour < 12) {
            System.out.println("Morning came. Time is " + hour + " o'clock. ");
            break;
        }
        while (hour > 12 && hour < 18) {
            System.out.println("The day has come. Time is " + hour + " o'clock. ");
            break;
        }
        while (hour > 18 && hour < 24) {
            System.out.println("Evening came. Time is " + hour + " o'clock. ");
            break;
        }

    }//end of main

}// end of class






