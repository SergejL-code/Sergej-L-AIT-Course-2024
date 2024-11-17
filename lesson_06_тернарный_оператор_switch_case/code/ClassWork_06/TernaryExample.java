package ClassWork_06;

// В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {

      int x = -500;
      int y = 200;

      int min = (x < y)? x : y;                               //ternary operator
        System.out.println("Min = " + min);

       int max = (x >= y)? x : y;
        System.out.println("Max = " + max);

        // input data

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        x = scanner.nextInt();
        System.out.println("Input 2st number: ");
        y = scanner.nextInt();

        min = minAB(x,y);
        System.out.println("Min = " + min);
    }//end of main

public static int minAB (int x,int y){
    return (x < y)? x : y;
}


}//end of class
