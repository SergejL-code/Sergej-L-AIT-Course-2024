package ClassWork_021.arrays_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {
    //fields
    private int[]array;

    // method

    //constructor
    public ArrayTdd(int[] array) {
        this.array = array;
    }


    //Getter and Setter

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Objects.deepEquals(array, arrayTdd.array);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
    //count positive numbers in array

    public int countPositive(int[]array){
        // Initialize a counter to track the number of positive elements
        int count=0;
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is greater than zero (positive)
            if(array[i]>0){
                // Check if the current element is greater than zero (positive)
                count++;
            }
        }
        // Return the total count of positive elements
        return count;
    }


}//end of class
