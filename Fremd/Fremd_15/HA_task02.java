package Fremd15;

//Задание 2. Напишите программу, которая запрашивает строку от пользователя и затем:
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class HA_task02 {
    public static void main(String[] args) {

        //запрос строки от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userIn = scanner.nextLine();

        //сколько слов в строке
        String[] words = userIn.trim().split("\\s+"); // Удаляем пробелы в начале и конце строки, затем разбиваем по пробелам
        int w = words.length;
        System.out.println("Количество слов в строке: " +w);

        //сколько букв (символов) в строке
        //считаем количество символов (включая пробелы)
        int totalCh = userIn.length();
        System.out.println("Количество символов в строке (включая пробелы): " + totalCh);

        //считаем количество букв (без пробелов)
        String[] letters = userIn.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: "+let);

        //печатаем строку задом наперед, начиная с последнего слова.
        //разбиваем строку на слова, используя пробелы в качестве разделителей
        String[] words1 = userIn.split("\\s+");
        // Печатаем слова в обратном порядке
        System.out.println("Строка задом наперед (начиная с последнего слова):");
        for (int i = words1.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
