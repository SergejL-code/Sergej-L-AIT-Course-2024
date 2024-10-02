package Fremd;

// Напишите программу, которая запрашивает строку от пользователя и затем:
// - сообщает сколько слов в строке
// - сообщает сколько букв (символов) в строке
// - печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Пожалуйста, введите свой текст: ");
        String st = scanner.nextLine();

        int l = st.length();
        System.out.println(l);

        String reversedText = ""; // инициализация переменной пустой строкой
        for (int i = st.length() - 1; i >= 0; i--) {
            reversedText += st.charAt(i);
        } // end of for
        System.out.println( " Строка задом наперед: " + reversedText);

    } // end of main
} // end of class
