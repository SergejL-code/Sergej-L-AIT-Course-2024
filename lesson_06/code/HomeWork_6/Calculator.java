package HomeWork_6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1 :");
        int number_1 = scanner.nextInt();
        System.out.println("Input operation:");
        char symbol = scanner.next().charAt(0);
        System.out.println("input number 2 :");
        int number_2 = scanner.nextInt();
        int resultat;
        switch (symbol) {
            case '+' : resultat = number_1 + number_2;
            System.out.println("After entering your data, the result is " + resultat);
        }












            // System.out.println("Wrong input!");







    }//end of main
}//end of class
 //System.out.println("After entering your data, the result is");