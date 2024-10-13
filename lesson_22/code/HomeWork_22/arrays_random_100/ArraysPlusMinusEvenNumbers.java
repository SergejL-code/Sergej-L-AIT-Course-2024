package HomeWork_22.arrays_random_100;
/* Create an array of 100 random integers in the range from -10 to 10. Count how many there are in this array:
   positive numbers;
   negative numbers;
   even numbers;
   zeros. Implement all calculations with methods and write tests for them.*/

import java.util.Arrays;

public class ArraysPlusMinusEvenNumbers {

    //fields
    int[] numbers;

//constructor


    public ArraysPlusMinusEvenNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ArraysPlusMinusEvenNumbers{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public static int[] fillArray() {
        int n = 100;
        int a = -10;
        int b = 10;

        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }//end of fillArray

    public int countPositiveNumbers(int[] numbers) {
        int countPositiv = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositiv++;
            }
        }
        return countPositiv;
    }//end of Method countPositiveNumbers

    public int countNegativeNumbers(int[] numbers) {
        int countNegativ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                countNegativ++;
            }
        }
        return countNegativ;
    }//  end of Method countNegativeNumbers

    public int countEvenNumbers(int[]numbers) {
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }//end of Method countEveNumbers

public int countZeroNumbers(int[]numbers){
        int countZero =0;
    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i]==0){
            countZero++;
        }

    }return countZero;
}//end of Method countZeroNumbers

}//end of class
