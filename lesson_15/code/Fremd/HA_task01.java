package Fremd;

//Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
//Выполнить практикум с этой строкой:
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.

public class HA_task01 {
    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        //Распечатать последний символ строки.
        char ch = str.charAt(0);
        ch = str.charAt(str.length() - 1);
        System.out.println("Last symbol: " + ch);

        //Найти позицию подстроки “Java” в строке.
        int index = str.indexOf("Java");
        System.out.println(index);

        //Проверить, содержит ли заданная строка подстроку “Java”.
        String substring = "Java";
        if (str.contains(substring)) {
            System.out.println("Строка содержит подстроку: " + substring);
        } else {
            System.out.println("Строка не содержит подстроку: " + substring);
        }

        //Заменить все символы “o” на “a”.
        System.out.println(str.replace("o", "a"));

        //Преобразуйте строку к верхнему регистру.
        String upperStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperStr);

        //Преобразуйте строку к нижнему регистру.
        String str1 = "I'M PROUD TO LEARN JAVA! JAVA IS THE MOST FAMOUS PROGRAMMING LANGUAGE!!!";

        // Преобразование строки в нижний регистр
        System.out.println("------------------------------------------------------");
        String lowerStr = str1.toLowerCase();
        System.out.println("Оригинальная строка: " + str1);
        System.out.println("Строка в нижнем регистре: " + lowerStr);
        System.out.println("------------------------------------------------------");

        //Вырезать подстроку Java c помощью метода substring().
        int startIndex = str.indexOf("Java");  // Начальный индекс подстроки
        int endIndex = startIndex + "Java".length();  // Конечный индекс подстроки
        // Вырезаем подстроку "Java"
        String subStr = str.substring(startIndex, endIndex);
        System.out.println("Оригинальная строка: " + str);
        System.out.println("Вырезанная подстрока: " + subStr);
        System.out.println("------------------------------------------------------");

        //Проверить, заканчивается ли строка подстрокой “!!!”.
        boolean endsWithEnd = str.endsWith("!!!");
        if (endsWithEnd) {
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }

        //Проверить, начинается ли строка подстрокой “I'm proud”.
        boolean endsWithStart = str.startsWith("I'm proud");
        if (endsWithStart) {
            System.out.println("Строка начинается на 'I'm proud'");
        } else {
            System.out.println("Строка не начинается на 'I'm proud'");
        }
    }
}
