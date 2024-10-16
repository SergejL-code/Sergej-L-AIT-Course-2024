package HomeWork_9;

//The program specifies hours, minutes, and seconds. It is necessary to output the total number of seconds that have passed since the beginning of the day.
// Perform the calculation in the method that receives hours, minutes, and seconds as input.

//В программе задаются часы, минуты и секунды. Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of hours:");
        double hour = scanner.nextDouble();
        System.out.println("Input the number of minutes:");
        double minute = scanner.nextDouble();
        System.out.println("Input the number of seconds:");
        double sek = scanner.nextDouble();

        double totalsek = calculateTotalSek(hour,minute,sek);
        System.out.println("The total number of seconds that have passed since the beginning of the day is " + totalsek);

    }//end of main

    private static double calculateTotalSek(double hour, double minute, double sek) {
double totalsek = (hour *3600) + (minute*60)+sek;
return totalsek;

    }//end of method


}//end of clacc
