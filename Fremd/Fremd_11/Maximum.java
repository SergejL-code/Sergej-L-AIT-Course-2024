package Fremd_11;

public class Maximum {

        public static void main(String[] args) {
            int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

            int max = array[0];
            int indexMax = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    indexMax = i;
                }
            }
            System.out.println(" Max = " + max + " indexMax = " + indexMax);

            // put max element on 1st index in array
            array[0] = array[indexMax];
            //print array
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(); // new line
        }



}
