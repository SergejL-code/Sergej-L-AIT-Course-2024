import Array_methods.ArrayMethods;

import java.util.Random;


public class Sort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[]{random.nextInt(100)};
        int n = a.length;
        stableSelectionSort(a, n);
       ArrayMethods.printArray(a);
    }

    public static void stableSelectionSort(int[] a, int n) {
        // Iterate through array elements
        for (int i = 0; i < n - 1; i++) {

            // Loop invariant : Elements till
            // a[i - 1] are already sorted.

            // Find minimum element from
            // array[i] to array[n - 1].
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[min] > a[j])
                    min = j;

            // Move minimum element at current i.Переместить минимальный элемент в  текущего i.
            int key = a[min];
            while (min > i) {
                a[min] = a[min - 1];
                min--;
            }

            a[i] = key;
        }
    }

}