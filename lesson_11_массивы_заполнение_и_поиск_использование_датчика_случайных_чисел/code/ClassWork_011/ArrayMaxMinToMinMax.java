//package ClassWork_011;
//
////Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
////Найдите минимальный элемент массива и его индекс.
////Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
////Найдите максимальный элемент массива и его индекс.
////Поменяйте местами минимальный и максимальный элементы, распечатайте массив.
//
//public class ArrayMaxMinToMinMax {
//    public static void main(String[] args) {
//        int[] array = {75, 34,-145, -15, -123, 57, -145, 86,77, 48, -59,-145};
//
//        int minOfArray = array [0];//guess
//        int indexOfMinElement = 0;//guess
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i]< minOfArray){
//                minOfArray=array[i];
//                indexOfMinElement = i;
//            }
//        }
//        System.out.println("Min element of array = " + minOfArray + ", indexof min element= " + indexOfMinElement);
//
//        int maxOfArray = array [0];//guess
//        int indexOfMaxElement = 0;//guess
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] > maxOfArray){
//                maxOfArray = array[i];
//                indexOfMaxElement = i;
//            }
//        }
//        System.out.println("Min element of array = " + maxOfArray + ", indexof min element= " + indexOfMaxElement);
//
//        int temp = array[indexOfMinElement];
//        array[indexOfMinElement] = array[indexOfMaxElement];
//        array[indexOfMaxElement]= temp;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.println();
//    }//end of main
//}//end of class
