package HomeWork_14;
//Problem 1. Fill the array with integers from 1 to 100.
// Create a second array with a size 1 larger than the existing one.
// Copy the first array to the new array. Add a random integer from 1 to 100 to a random place in the original array.
// Find the shortest way to find the number that was added to the array.
//--------------------------------------------------------------------------------------------------------------------
//Задача 1. Часть1. Заполните массив целыми числами от 1 до 100. Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
//Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
//Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import Array_methods.ArrayMethods;

import java.util.Random;

public class ArrayVon_1To_100 {
    public static void main(String[] args) {

        // Part 1: Create an Array of Numbers 1 to 100 (Создаем массив из чисел от 1 до 100)
        //------------------------------------------------------------------------------------
        int[] array = new int[100];                 //Declaring an array of size 100 (Объявляем массив размером 100)
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;                       //Fill the array with numbers from 1 to 100(Заполняем массив числами от 1 до 100)
        }
        ArrayMethods.printArray(array);             // Print the Source Array(Печать исходного массива)


        int[] newArray = ArrayMethods.copyArrayWithAddNewElement(array);

        ArrayMethods.printArray(newArray);          // Print a new array befor inserting a random number
        //---------------------------------------------------------------------------------------------
        // Part 2: Generate a Random Number and Insert It into a Random Position
        // Генерируем случайное число и вставляем его в случайную позицию

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;// Random number from 1 to 100(Случайное число от 1 до 100)
        int randomIndex = random.nextInt(newArray.length);// Random position from 0 to 100(Случайная позиция от 0 до 100)

        for (int i = newArray.length - 1; i > randomIndex; i--) {
            newArray[i] = newArray[i - 1];                 // Move  element one position to the right( Сдвигаем каждый элемент на одну позицию вправо)
        }// end of fori

        newArray[randomIndex] = randomNumber;            // Insert a random number(Вставляем случайное число)

        ArrayMethods.printArray(newArray);              // Print an array after inserting a number(Печать массива после вставки числа)
        //----------------------------------------------------------------------------------------------------------------------------
        // Часть 3:Search  added number (поиск добавленного числа)

        int addedNumber = ArrayMethods.findAddedNumber(array, newArray);//The method finds which number has been added(Метод находит, какое число было добавлено)
        int addedIndex = ArrayMethods.findAddedIndex(array, newArray);//The method finds the index of the added number(Метод находит индекс добавленного числа)
        System.out.println("Added number: " + addedNumber);
        System.out.println("index: " + addedIndex);

    }//end of main


} //end of class
