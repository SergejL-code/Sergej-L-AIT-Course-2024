package HomeWork_7;
// The program receives as input a string and the number of repetitions of this string.
// The program should print this string required numbers of times.
//Программа получает на вход строку и число повторений этой строки. Программа должна вывести эту строку нужное количество раз.

import java.util.Scanner;

public class StringAndNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = scanner.next();
        System.out.println("Input how many repetitions you need: ");
        int rep = scanner.nextInt();
        int rep_1 = rep;

        while (rep > 0) {
            rep--;
            System.out.println(word);

        }//end of cycle
        System.out.println(" The Word " + word + " was repeatet " + rep_1 + " times.");
    }//end of main
}//end of class
