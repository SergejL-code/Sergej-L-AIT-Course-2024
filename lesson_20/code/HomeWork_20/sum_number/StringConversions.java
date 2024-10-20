package HomeWork_20.sum_number;
/*Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.*/

import java.util.Scanner;
// Declaring a Primary Class Объявление основного класса
public class StringConversions {

    public static void main(String[] args) {

        // Создаем объект Scanner для чтения пользовательского ввода из консоли
        //Create a Scanner object to read user input from the console

        Scanner scanner = new Scanner(System.in);
        // Просим у пользователя ввести несколько целых чисел в строке через пробел
        // ask the user to enter several integers in a string over a space

        System.out.println("Input multiple integers in a string over a space ; ");

        // Читаем строку, введённую пользователем
        //Read a string entered by the user

        String numbers = scanner.nextLine();

        // Разделяем строку по пробелам, получая массив строк, каждая которых — это одно число
        // Divide the string by spaces, getting an array of strings, each of which is a single number

        String[] strNum = numbers.split(" "); // split(" ") разбивает строку по пробелами и возвращает массив строк
                                                //split(" ") splits the string by space and returns an array of strings

            // Инициализируем переменную для хранения суммы чисел
            //Initialize a variable to store the sum of the numbers

        int sum = 0;// Начальная сумма равна нулю The initial sum is zero

        // Проходим по каждому элементу массива strNum
       //Go through each element of the strNum array

        for (String num :strNum){

            // Преобразуем строковое представление числа в целое число с помощью Integer.parseInt()
            //Convert a string representation of a number to an integer using Integer.parseInt()

            sum = sum + Integer.parseInt(num); // Добавляем преобразованное число к сумме
                                                //Add the converted number to the sum
        }

        System.out.println("the sum of all the numbers enteredsum " + sum);// Печатаем print

    }//end of main
}//end of class
