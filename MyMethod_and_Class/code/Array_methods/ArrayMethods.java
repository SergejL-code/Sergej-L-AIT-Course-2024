package Array_methods;


public class ArrayMethods {

 //==================================================================================================================




//===================================================================================================================

    // Selection Sort( выборочная сортировка)
static void stableSelectionSort(int[] a, int n) {// This code is contributed by Mr. Somesh Awasthi
    // Iterate through array elements
    for (int i = 0; i < n - 1; i++) {
        // Loop invariant : Elements till
        // a[i - 1] are already sorted.
        // Find minimum element from
        // arr[i] to arr[n - 1].
        int min = i;
        for (int j = i + 1; j < n; j++)
            if (a[min] > a[j])
                min = j;
        // Move minimum element at current i.
        int key = a[min];
        while (min > i) {
            a[min] = a[min - 1];
            min--;
        }
        a[i] = key;
    }
}




    //======================================================================================================
    // method swap
    public static void swap_1(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //=====================================================================================================
// array turn around or reverse

    //step1 -method swap
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //  step2 -reverse array
    public static void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    //=======================================================================================================
//bubble sort
    //  O(n²)
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {//compare 2 elements of array,if left>right => swap
                    //swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //==================================================================================================================
//binary search
//O(log(n))
//только сортированный массив von gross zu klein
    public static int binarySearchGrossZuKlein(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n) {
                return midIndex;
            } else if (n < array[midIndex]) {
                //right Index out(правый индекс надо отбросить)
                rightIndex = midIndex - 1;
                //left Index out(левый индекс надо отбросить)
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return -leftIndex - 1;// If element not search(если элемент не нашёлся)
    }//end of method binarySearch


    //=====================================================================================================

    //binary search
    //O(log(n))
    //только сортированный массив von klein zu gross
    public static int binarySearchvonKleinZuGross(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n) {
                return midIndex;
            } else if (n < array[midIndex]) {
                //right Index out(правый индекс надо отбросить)
                rightIndex = midIndex - 1;
                //left Index out(левый индекс надо отбросить)
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return -leftIndex - 1;// If element not search(если элемент не нашёлся)
    }//end of method binarySearch

//======================================================================================================

    //liner search,return index( if element absent return -1)
    //O(n)  чем больше элементов массива, тем дольше работает метод.
    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i; // go out from method (return index, no element)
            }//end of if
        }//end of for
        return -1;
    } //end of method linearSearch

    //====================================================================================================

    //fill array random numbers
    //a-left border; b-right border; n-quanty

    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }
  //========================================================================================================
//среднее арифметическое значение всех его элементов
    public static double averageValue(double[] array) {
        double sum = 0.0; // Инициализация переменной для суммы
        for (double num : array) { // Итерация по всем элементам массива
            sum += num; // Добавление текущего элемента к сумме
        }
        return (array.length > 0) ? (sum / array.length) : 0.0; // Возврат среднего значения, обработка деления на ноль
    }
//========================================================================================================

//сумму всех его элементов
//==========================================================================================================
    public static int sumArray(int[] array) {
        int sum = 0; // Инициализация переменной для суммы
        for (int num : array) { // Итерация по всем элементам массива
            sum += num; // Добавление текущего элемента к сумме
        }
        return sum; // Возврат суммы
    }





    // add percent
    public static double[] calculatePercent(double[] array, double percent){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] *  (100 + percent)/100.0;
        }
        return array;
    }



    //print array

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
    }

    //search is array
// n -
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }//end of if
        }//end of for
        return false;
    }//end of Method searchInArray
//=================================================================================================

    // Method to find an added number without sorting
    // Метод для нахождения добавленного числа без сортировки
    public static int findAddedNumber(int[] array, int[] newArray) {

        // Сравниваем элементы массивов до тех пор, пока не найдем первое различие
        for (int i = 0; i < array.length; i++) {
            if (array[i] != newArray[i]) {
                return newArray[i];  // // Возвращаем первое различие и его индекс
            }
        }
        // Если все элементы совпадают до конца массива array,
        // значит добавленное число — это последний элемент newArray
        return newArray.length - 1;// Возвращаем последний элемент и его индекс
    }

    //=============================================================================================================
    public static int findAddedIndex(int[] array, int[] newArray) {
        // Сравниваем элементы массивов до тех пор, пока не найдем первое различие
        for (int i = 0; i < array.length; i++) {
            if (array[i] != newArray[i]) {
                return i; // Возвращаем индекс первого различия
            }
        }
        // Если все элементы совпадают до конца массива array, значит добавленное число на последнем индексе
        return newArray.length - 1; // Возвращаем последний индекс как место добавленного числа
    }

    //===============================================================================================
    //Method add Percent on an account

//    public static double calculatePercent(double[]array, double percent) {
//        //начисленный остаток=остаток+(100остаток×X)/100
//        // Calculating the new balance taking with Percent(Расчет нового баланса с учетом процентов)
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] + (array[i] * percent / 100);
//        }
//        //return array ;
//    }//end of Method calculatePercent

//========================================================================================================================

    //  print array double
    public static void printArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    //=================================================================================================================

    //Method ArrayCopyElements with identical length
    //source(источник); destination(назначение)
    public static void copyArray(int[] source, int[] destination) {
        // Проверяем, что массивы одинакового размера(Verify that the arrays are the same size)
        if (source.length != destination.length) {
            System.out.println("Arrays have different sizes, copying is impossible.");
            return;
        }
        // Copying Elements Using a Loop(Копируем элементы с помощью цикла)
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    //===================================================================================================================

    // Method for copying an array with the addition of a single element(Метод для копирования массива с добавлением одного элемента)
    public static int[] copyArrayWithAddNewElement(int[] source) {
        // Создаем новый массив на 1 элемент больше, чем исходный
        int[] newArray = new int[source.length + 1];
        // Copy all the elements of the original array to the new array
        // (Копируем все элементы исходного массива в новый массив)
        for (int i = 0; i < source.length; i++) {
            newArray[i] = source[i];
        }
        return newArray;
    }

    //====================================================================================================================
// Method for copying an array (Метод для копирования массива)
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];           // Создаем новый массив указанной длины
        int lengthToCopy;                               // Определяем минимальную длину для копирования
        if (newLength > array.length) {
            lengthToCopy = array.length;               // Копируем все элементы, если новый массив длиннее
        } else {
            lengthToCopy = newLength;                  // Копируем только newLength элементов
        }
        for (int i = 0; i < lengthToCopy; i++) {       // Копируем элементы из старого массива в новый
            newArray[i] = array[i];
        } // end of for
        return newArray;
    } // end of method


    //===============================================================================================================
}//end of class
