package Fremd15;

 // Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.

public class Task1 {
    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);

        System.out.println("______________________________________________________________________");

        // print last symbol
        char ch = str.charAt(str.length() - 1);
        System.out.println(" Last symbol: " + ch);
        System.out.println("_______________________________________________________________________");

        //Найти позицию подстроки “Java” в строке.

        String substring = "Java";
        int index1 = str.indexOf(substring);
        System.out.println("Первое вхождение подстроки \"Java\" на позиции: " + index1);
        int index2 = str.indexOf(substring,index1 + 1);
        System.out.println("Второе вхождение подстроки \"Java\" на позиции: " + index2);
        System.out.println("_______________________________________________________________________");

        //Проверить, содержит ли заданная строка подстроку “Java”.

        int index = str.indexOf(substring);

        if (index >= 0) {                                                // индекс 1-го вхождения
            System.out.println("Строка содержит подстроку \"Java\".");
        } else {
            System.out.println("Строка не содержит подстроку \"Java\".");
        }

        System.out.println("_______________________________________________________________________");

        //Заменить все символы “o” на “a”.

        str.replace("o","a");
        System.out.println(str.replace("o","a"));

        System.out.println("_______________________________________________________________________");

        //Преобразуйте строку к верхнему регистру.

        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);
        System.out.println("_______________________________________________________________________");

        //Преобразуйте строку к нижнему регистру.
        String strUpperCase = "I'M PROUD TO LEARN JAVA! JAVA IS THE MOST FAMOUS PROGRAMMING LANGUAGE!!!";
        String lowerCaseStr = strUpperCase.toLowerCase();
        System.out.println(lowerCaseStr);
        System.out.println("_______________________________________________________________________");


        //Вырезать подстроку Java c помощью метода substring().
        String substring1 = "Java";
        System.out.println(substring1);
        System.out.println("_______________________________________________________________________");

        // Проверить, заканчивается ли строка подстрокой “!!!”.

        String substring2 = "!!!";

        if (str.length()>= substring2.length() && str.substring(str.length() - substring2.length()).equals(substring2)) {
            System.out.println("Строка заканчивается подстрокой \"!!!\".");
        } else {
            System.out.println("Строка не заканчивается подстрокой \"!!!\".");
        }
        System.out.println("_______________________________________________________________________");

        //Проверить, начинается ли строка подстрокой “I'm proud”.

        String substring3 = "I'm proud";

        if (str.length()>= substring3.length() && str.substring(str.length() - substring3.length()).equals(substring3)) {
            System.out.println("Строка заканчивается подстрокой \"I'm proud\".");
        }else{
            System.out.println("Строка не заканчивается подстрокой \"I'm proud\".");
        }

    }   // end of main
} // end of class
