package ClassWork_030.sorting_integer;

import java.util.Arrays;

public class SortingInteger {
    public static void main(String[] args) {
        Integer[] numbers = {-100, 2, Integer.MAX_VALUE, 2, 15, 25, Integer.MIN_VALUE, 71};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("===================================================");
        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1));

        //draft print
        System.out.println(Arrays.toString(numbers));
        //for each
        int index = 0;
        for (Integer n : numbers) {
            System.out.println(n + " " + index + " | ");
            index++;
        }
    }
}//end of class
