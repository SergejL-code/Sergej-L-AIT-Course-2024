package HomeWork_20.mom_clean_windows;
/*Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:

количество символов в строке;
количество символов в верхнем регистре;
количество цифр в строке;
количество пробелов в строке (код пробела = 32);
в зависимости от последнего символа в строке сообщает, какое это предложение:
повествовательное;
вопросительное;
восклицательное. Используйте методы класса Character.*/

import java.util.Scanner;

public class Sentense {
    public static void main(String[] args) {
        // Создаем сканер
        Scanner scanner = new Scanner(System.in);
        //просис ввести строку
        System.out.println(" input your sentense : ");

        String str = scanner.nextLine();
        // Инициализируем счётчики для различных параметров
        int totalChars = str.length();    //общее количество символов в строке:
        int upperCaseCount = 0;             //количество символов в верхнем регистре:
        int digitCount = 0;                 //количество цифр в строке:
        int spaceCount = 0;                 // количество пробелов в строке:
        //  Проходим по каждому символу в строке
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }

            // Проверяем на цифру
            if (Character.isDigit(ch)) {
                digitCount++;
            }

            // Проверяем на пробел (код пробела = 32)
            if (ch == ' ') {
                spaceCount++;
            }
        }
        // Выводим количество символов
        System.out.println("Number of characters in a string: " + totalChars);
        System.out.println("Number of characters in upper case: " + upperCaseCount);
        System.out.println("Number of digits in the string: " + digitCount);
        System.out.println("Number of spaces in the string: " + spaceCount);
    }
}//end of class
