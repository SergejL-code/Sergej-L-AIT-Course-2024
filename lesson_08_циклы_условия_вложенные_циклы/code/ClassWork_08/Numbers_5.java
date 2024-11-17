package ClassWork_08;

import java.util.Scanner;

//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers_5 {
    public static void main(String[] args) {

        int i = 1; //Parameter Cicle start
        int a = 101;// end
        while (i < a) {
            if (i % 5 == 0) {   //rest soll 0 sein
                System.out.print(i + " ");

            }// end of if
            i++; //постфиксная операция увеличивается на 1
        }//end of while
    }//end of main
}//end of class
