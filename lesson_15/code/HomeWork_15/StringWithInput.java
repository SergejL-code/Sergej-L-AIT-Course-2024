package HomeWork_15;
//Write a program that requests a string from the user and then:
//tells how many words are in a line
//tells how many letters (symbols) are in the line
//prints the line backwards, starting with the last word.

import java.util.Scanner;

public class StringWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence, please.");
        String sentence = scanner.nextLine();

        //Divide a sentence into words using a space as a separator
        String[] words = sentence.split(" ");

        //Number of words in a sentence
        int mengewords = words.length;

        //Divide a sentence into separate symbols (letters)
        String[] letters = sentence.split("");
        int let = letters.length;

        System.out.println("Numbers of word in a sentence: " + mengewords + " and " + let + " letters.");

        //  words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");  //Start with the last word (words.length index - 1) and go to 0
        }//end of fori

    }//end of main
}//end of class
