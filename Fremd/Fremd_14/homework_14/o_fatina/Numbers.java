package Fremd14.homework_14.o_fatina;

import java.util.Random;

public class Numbers {


    public static void main(String[] args) {

//Часть1. Заполните массив целыми числами от 1 до 100.
        int[] number = new int[100];

        System.out.print("Start array: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;//заполнение от 1 до 100
            System.out.print(number[i] + ", ");
        }
        System.out.println();;

// Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
        int[] newNumber = new int[number.length + 1];//копируем элементы из одного массива в другой

        System.out.print("Copied array: ");
        for (int j = 0; j < newNumber.length; j++) {
            newNumber[j] = j + 1;
            System.out.print(newNumber[j] + ", ");
        }
//Добавьте случайное целое число в интервале от 1 до 100 на
// случайное место в исходный массив.
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;//генерируем случайное число от 0 до 100
        int randomIndex = random.nextInt(number.length);//случайный индекс
        for (int i = number.length - 1; i > randomIndex; i--) {
            number[i] = number[i-1];
        }
//вставляем случайное число на случайное место
        number[randomIndex] = randomNumber;
        //выводим новый массив

        System.out.println();
        System.out.print("New array: ");
        for (int i = 0; i < number.length; i++){
            System.out.print(number[i]);
            if (i<number.length - 1){
                System.out.print(", ");
            }
        }
        //выводим добавленное число
        System.out.println();
        System.out.println("Addae number: "+ randomNumber+ " and random index: " + randomIndex);
    }
}
