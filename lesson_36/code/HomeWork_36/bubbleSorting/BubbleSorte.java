package HomeWork_36.bubbleSorting;

import java.util.Random;

/*Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?

Task 1. Add a counter to the bubbleSort method to find out how many operations were performed during sorting. Sort the elements of arrays that contain 10, 100, and 1000 elements. Fill the arrays with random integers in the range from 0 to 1000. How does the number of operations during sorting increase as the number of array elements increases?
 */
public class BubbleSorte {
    public static void main(String[] args) {

        Random random = new Random();

        int[] res= new int[10];
        // fill in array numbers
        for (int i = 0; i < res.length; i++) {
           res[i] = random.nextInt(100) + 1;
        }



        } public static int[] numbers(int a, int b, int n) {
            int[] res = new int[n];
            for (int i = 0; i < res.length; i++) {
                res[i] = (int) (Math.random() * (b - a + 1) + a);
            }
            return res;
    }
    public static int bubbleSort(int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {//compare 2 elements of array,if left>right => swap
                    //swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }
        printArray(array);
        return count;
    }//end of bubblesort

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " / ");
        }
    }
}//end of class
