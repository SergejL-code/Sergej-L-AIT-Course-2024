package HomeWork_22.arrays_methods;

import java.util.Arrays;

public class ArrayMethods {

    //fields

    int[] arrray;


    //conctructor
    public ArrayMethods(int[] arrray) {

        this.arrray = arrray;
    }

    public int[] getArrray() {
        return arrray;
    }

    public void setArrray(int[] arrray) {
        this.arrray = arrray;
    }

    @Override
    public String toString() {
        return "ArrayMethods{" +
                "arrray=" + Arrays.toString(arrray) +
                '}';
    }

    public static int sumOfAllElementsWithOddIndex(int[] arrray) {
        int sum = 0;
        for (int i = 1; i < arrray.length; i += 2) {//increased the counter by two on the aisle
            sum += arrray[i];//Add an element with an odd index
        }
        return sum;

    }//end of sumOfAllElementsWithOddIndex


    public static int searchInArray(int[] array) {
        if (array.length >= 5) {
            return array[4];//Return the 5th element (index 4)
        } else {
            return -1;// Return -1 if the elements are less than 5
        }//end of else
    }//end of searchInArray


}//end of class