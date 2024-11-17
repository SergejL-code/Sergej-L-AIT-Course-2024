package HomeWork_10;

//Given an array of integers: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Find the maximum array element and its index.
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                System.out.print("The maximum array element " + maxNumber + " and its index " + i);
            }//end of if
        }//end of for

    }//end of main
}//end of class
