package HomeWork_10;

//Create an array of 20 random integers ranging from 10 to 20. Print the array.
// Swap the first and last elements of the array and print the array again.
//Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class RandomNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[]{10, 15, 18, 12, 14, 26, 19, 11, 17, 24, 23, 25, 29, 30, 13, 19, 13, 10, 18, 14};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
      /*  for (int i = 0; i < numbers.length; i++) {
            numbers[19] = 10;
            numbers[0] = 14;
            System.out.print(numbers[i] + " ");
        }*/
        int temp = numbers[0];
        numbers[0]=numbers[numbers.length-1];
        numbers[numbers.length-1] = temp;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+  " ");
        }
    }//end of main
}//end of class