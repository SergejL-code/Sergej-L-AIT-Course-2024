package ClassWork_012;

import Array_methods.ArrayMethods;

import java.util.Random;

////  - заполнение массива случайными целыми числами из интервала от a до b
////  - печать массива целых чисел
public class FillArrayWithRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        // fill in array numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // print array numbers
        ArrayMethods.printArray(numbers);

    }//end of main
}//end of class
