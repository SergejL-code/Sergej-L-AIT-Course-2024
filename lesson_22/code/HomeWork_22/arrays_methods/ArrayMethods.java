package HomeWork_22.arrays_methods;

import java.util.Arrays;

public class ArrayMethods {

    //fields

    int[] arrray;


    //conctructor
    public ArrayMethods(int[] arrray) {

        this.arrray =  new int[]{1, 4, 1, 5, -5, 4, 2, 5};
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
        for (int i = 1; i < arrray.length; i += 2) {//увеличили счетчик на 2 на проходе
            sum += arrray[i];//Добавляем элемент с нечетным индексом
        }
        return sum;

    }//end of sumOfAllElementsWithOddIndex


    public static int searchInArray(int[] array) {
        if (array.length >= 5) {
            return array[4];// Возвращаем 5-й элемент (индекс 4)
        } else {
            return -1;// Возвращаем -1, если элементов меньше 5
        }//end of else
    }//end of searchInArray


}//end of class