//package Fremd_13;
//
//public class KProzentam {accrues interest на каждый елемент массива + 0.05%
//    public static double [] calculatePercent (double [] array){
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] + (array[i] * 0.05);
//        }//end for
//        return array;
//    }//end calculatePercent
//
//    //print double[] array
//    public static void printArrayDouble (double [] array){
//        int n = 0;
//        System.out.println(); // добавил println т.к. следующая печать printf
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf(" %.2f", array[i]);
//            n++;
//            if ( n < array.length) {
//                System.out.print("; ");
//            }//end if
//        }//end for
//        System.out.println();
//        System.out.println("------------------------------");
//    }//end printArray
//
//    //fill double[] array random numbers
//// a - left border, b - right border, n - quantity (array size)
//    public static double[] fillArrayDouble (double a, double b, int n){
//        double [] res = new double[n];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = (Math.random() * (b - a + 1) + a);
//        }//end for
//        return res;
//    }//end fillArray
//
//    //sumArray(double[] array) - возвращает сумму всех элементов массива.
//    public static double sumArrayDouble (double[] array){
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        return sum;
//    }//end sumArray
//
//    //averageValue(double[] array) - возвращает среднее арифметическое значение всех элементов массива.
//    public static double averageValueDouble (double [] array){
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }//end for
//        return sum / array.length;
//    }//end averageValue
//
//    //fill array random numbers
//// a - left border, b - right border, n - quantity (array size)
//    public static int[] fillArray(int a, int b, int n){
//        int [] res = new int[n];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = (int) (Math.random()*(b - a + 1)+ a);
//        }//end for
//        return res;
//    }//end fillArray
//
//    //print int[] array
//    public static void printArray (int [] array){
//        int n = 0;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            n++;
//            if ( n < array.length) {
//                System.out.print(", ");
//            }//end if
//        }//end for
//        System.out.println();
//        System.out.println("------------------------------");
//    }//end printArray
//
//    //search in array
//    public static boolean searchInArray ( int [] array, int n){
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == n){
//                return true;
//            }//end if
//        }//end for
//        return false;
//    }//end searchInArray
//
//    //sumArray(int[] array) - возвращает сумму всех элементов массива.
//    private static int sumArray (int[] array){
//        int res =0;
//        for (int i = 0; i < array.length; i++) {
//            res = res + array[i];
//        }
//        return res;
//    }//end sumArray
//}
