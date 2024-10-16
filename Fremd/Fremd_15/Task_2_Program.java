package Fremd15;

//Task 2.(*) Write a program that requests a string from the user and then:
//
//tells how many words are in a line
//tells how many letters (symbols) are in the line
//prints the line backwards, starting with the last word.

import java.util.Scanner;

public class Task_2_Program {

    public static void main(String[] args) {

        //inputting the line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string of your choice (a word or a sentence): ");
        String str = scanner.nextLine(); //nextLine inputs the whole line(string), next inputs only one word(substring)
        System.out.println("The entered string is:");
        System.out.println(str);

        //telling how many words are in a line
        //variant with a regex \\s+
        String[] words = str.split("\\s+"); // \\s+ - s - space characters (spaces, tabs, new lines), + - quantifier, one or more non-letter characters in sequence
        int w = words.length;
        System.out.printf("There are %d words in your line.", w);

        System.out.println();

        String[] words2 = str.split(" ");
        int w2 = words.length;
        System.out.printf("There are %d words in your line.", w2);

        System.out.println();

        //telling how many letters (symbols) are in the line
        //variant with cycle for
        String[] letters = str.split("");
        int l = 0;
        for (int i = 0; i < letters.length; i++) { // ! - doesn't equal
            if(!letters[i].equals(" ")){
                l++;
            }
        }
        System.out.printf("There are %d symbols in your line.", l);

        System.out.println();

        //variant with method replaceAll
        String[] letters2 = str.replaceAll("\\s+", "").split(""); //we replace every element that represents free space
        int l2 = letters2.length;
        System.out.printf("There are %d symbols in your line.", l2);

        System.out.println();

        //printing the line backwards, starting with the last word
        String[] backwards = str.split("\\s+");
        for (int i = backwards.length - 1; i >= 0; i--) {
            System.out.print(backwards[i]);
            if(i > 0){
                System.out.print(" ");
            }
        }


    }//end of main

}//end of class
