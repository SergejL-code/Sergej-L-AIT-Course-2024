package Fremd14.homework_14.g_adler;

//Задача 1. Часть1. Заполните массив целыми числами от 1 до 100.
            //Создайте второй массив с размером на 1 больше, чем имеющийся.
            //Скопируйте первый массив в новый массив.
//Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
//Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.
import java.util.Arrays;//используем, чтобы с помощью Arrays.toString напечатать строкой целые числа int
import java.util.Random;//используем, чтобы вставить рандомно сформированное число в массив

public class Task01_27_09 {
    public static void main(String[] args) {
          // Часть 1:
// Заполните массив целыми числами от 1 до 100.
        int[] arrayNumbers = new int[100];//заполняем массив от 1 до 100
        for (int i = 0; i < 100; i++) {
            arrayNumbers [i] = i + 1;// +1 - чтобы массив был от 1 до 100, а не от 0 до 99
        }
        ArrayMethods.printArray(arrayNumbers);//Вызываем метод для печати первого массива

//Создайте второй массив с размером на 1 больше, чем имеющийся.
        int[] newArrayNumbers = new int[100+1];//заполняем массив от 1 до 101 (100+1)
        for (int i = 0; i < 100+1; i++) {
            newArrayNumbers [i] = i + 1;// +1 - чтобы массив был от 1 до 101
        }
        ArrayMethods.printArray(newArrayNumbers);//Вызываем метод для печати второго массива

//Скопируйте первый массив в новый массив.
        for (int i = 0; i < arrayNumbers.length; i++) {
            newArrayNumbers[i] = arrayNumbers [i];
        }

               // Часть 2:
//Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
        Random random = new Random();//создаем объект random, чтобы сгенерировать случайное число от 1 до 100
        int randomNumber = random.nextInt(100) + 1;  // Случайное число от 1 до 100 (+ 1 чтобы число не было от 0 до 99)
        int randomPosition = random.nextInt(101);     // Случайная позиция случайного числа от 0 до 100 в индексе от 0 до 100

        for (int i = newArrayNumbers.length-1; i > randomPosition; i--) {// Сдвигаем элементы массива, чтобы вставить новое рандомное число
            newArrayNumbers[i] = newArrayNumbers[i-1];
        }
        newArrayNumbers[randomPosition] = randomNumber;  // Вставляем случайное число
//
              // Часть 3.
// В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.
        int addedNumber = newArrayNumbers[randomPosition];//ищем случайное число
//
//Выводим все результаты
    System.out.println("Array: " + Arrays.toString(arrayNumbers));//изначальный массив на 100 элементов
    System.out.println("New array + 1 element: " + Arrays.toString(newArrayNumbers));//массив на 101 элемент
    System.out.println("Added number: " + addedNumber);//случайное число
    System.out.println("Index of added number: " + randomPosition);// индекс случайного числа

    }//end of main
}//end of class
