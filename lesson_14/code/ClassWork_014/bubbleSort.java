package ClassWork_014;

import Array_methods.ArrayMethods;

public class bubbleSort {
    public static void main(String[] args) {
        //greate array with random numbers
        int[] myArray = ArrayMethods.fillArray(0, 100, 10);
        //print array
        ArrayMethods.printArray(myArray);
        // sort array
        ArrayMethods.bubbleSort(myArray);
        //print array
        ArrayMethods.printArray(myArray);
    }//end of main
}//end of class
