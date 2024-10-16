package HomeWork_9;
//Write a program that outputs the maximum of three integers. Specify the numbers yourself inside the program.
// Solve this problem using if ... else also using the ternary operator.

//Написать программу, выводящую на экран максимальное из трех целых чисел. Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

import java.util.Scanner;

public class ThreeIntegreswithTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1");
        int num_1 = scanner.nextInt();
        System.out.println("Input number 2");
        int num_2 = scanner.nextInt();
        System.out.println("Input number 3");
        int num_3 = scanner.nextInt();

        int max_res = (num_1 >= num_2) ? (num_1 >= num_3 ? num_1 : num_3) : (num_2 >= num_3 ? num_2 : num_3);

        System.out.println("The maximum of three integers is  " + max_res);

    }//end of main

}// end of class
