package ClassWork_014;
import Array_methods.ArrayMethods;

public class ArrayTurnAroundOrReverse {
    public static void main(String[] args) {

        int[] newArray = ArrayMethods.fillArray(1,20,6);
        ArrayMethods.printArray(newArray);
        ArrayMethods.reverseArray(newArray);
        ArrayMethods.printArray(newArray);

    }//end of main

}//end of class
