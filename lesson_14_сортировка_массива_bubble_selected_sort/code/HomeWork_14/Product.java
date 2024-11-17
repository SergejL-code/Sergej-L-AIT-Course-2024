package HomeWork_14;

import Array_methods.ArrayMethods;

//Find the product of all two-digit odd numbers that are multiples of 17.
//Найти произведение всех двузначных нечетных чисел кратных 17
public class Product {
    public static void main(String[] args) {
        int[] numbers = ArrayMethods.fillArray(10, 99, 99); //Create an array of numbers from 10 to 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;                                    //Fill the array with numbers from 10 to 99
        } //end of fori
      ArrayMethods.printArray(numbers);                             //Print for check
        int odd = returnOddNumber(numbers);                         //call fo Method
        System.out.println("Product of all two-digit odd multiples of 17: " + odd);
    }//end of main

    public static int returnOddNumber(int[] array) {
        int multiply = 1;                                            //variable for the product(переменная для умножения)
        for (int i = 0; i < array.length; i++) {
            int num = array[i]; //  Current Number( текущее число)
            // Check if the number is a multiple of 17 and odd odd(Проверяем, кратно ли число 17 и нечетное)
            if (num % 17 == 0 && num % 2 != 0) {
                multiply = multiply * num;                 // Multiply by the number found(Умножаем на найденное число)
            }//end of if

        }//end of fori

        //If multyply remains = 1,no numbers were found
        if (multiply == 1) {
            return 1;
        }//end of if
        return multiply; // return product
    }//end of Method

}//end of class

