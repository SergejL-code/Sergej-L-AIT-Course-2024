package HomeWork_30.doublewrapper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/* Create an array of real numbers based on the Double wrapper class with 10 elements, fill it with random numbers in the range from 0 to 10. Do the sorting:
ascending;
descending.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортровки:
ascending; //
descending. //
 */
public class DoubleWrapper {
    public static void main(String[] args) {
        //Great array with 10 numbers
        Double[] numbers = new Double[10];
        // Initialise the array with values
        Random random =new Random();
        for (int i = 0; i < numbers.length; i++) {
            //fill with random numbers
            numbers[i]=random.nextDouble()*10;
        }
        System.out.println("=======================Array not sorting===================================");
            System.out.println("    " + Arrays.toString(numbers));
            Arrays.sort(numbers);
        System.out.println();

        System.out.println("====================Array sorting ascending===============================================");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        System.out.println("=======================================Array sorting decending with Lamda================================================================");
        Arrays.sort(numbers,(a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        System.out.println("================================Array sorting acsending with Lamda==============================================================");
        Arrays.sort(numbers,(a,b)-> a.compareTo(b));
        System.out.println(Arrays.toString(numbers));
        System.out.println();


        System.out.println("=============================Array sorting decending==============================================");
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));
        System.out.println();


    }

}//end of class
