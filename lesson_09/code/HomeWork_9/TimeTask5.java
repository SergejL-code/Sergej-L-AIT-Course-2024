package HomeWork_9;

//The program asks the user for the number of seconds that have passed since the beginning of the day.
// It is necessary to display hours, minutes and seconds.
// Check that the number of seconds entered by the user is no more than 86,400.

import java.util.Scanner;

//Программа запрашивает у пользователя количество секунд, прошедших с начала суток.
// Нужно вывести часы, минуты и секунды. Проверьте, что число введенных пользователем секунд не более 86 400.
public class TimeTask5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Input the number of seconds: ");
       int second = scanner.nextInt();
        //check the number of seconds
        if (second >= 86400) {
            System.out.println("Wrong input!");
        }
        int convertSec_1 = convertToHour(second);;
        int convertSec_2 = convertToMinutes(second);
        int convertSec_3 = convertToSecond(second);
               System.out.println("Since the beginning of the day has passed " + convertSec_1 + " hours " + convertSec_2 + " minutes " + convertSec_3 + " seconds ");

    }//end of main


    private static int convertToHour(int second) {
        return second / 3600;
    }
    private static int convertToMinutes(int second) {

        return (second % 3600) /60;//second-(3600*second/3600)
    }

    private static int convertToSecond( int second) {
        return second % 60 ;
    }
}//end of class
