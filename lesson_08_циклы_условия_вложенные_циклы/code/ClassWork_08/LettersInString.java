package ClassWork_08;
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.

import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String word = scanner.nextLine();
        System.out.println("");

        int l = word.length();
        System.out.println(l);
        int i = 0;
        // leonid->
        // 012345->
        while (i < l) {
            System.out.print(word.charAt(i));
            i++;//i=i+1 or i+=1
        }

    }

}
