package HomeWork_21.find_min_max_numbers_and_min_max_index_in_arrays;
/*Разработайте тесты для методов обрабатывающих массивы:
   поиск минимального (максимального) элемента
   поиск индекса минимального (максимального) элемента*/
import java.util.Arrays;

public class MyArrays {

    private int[] myArrays;    // Class field to store an array of numbers
                                // Поле класса для хранения массива чисел


        //Metod

         //constructor

    public MyArrays(int[] myArrays) {
        this.myArrays = myArrays;      //Assign the passed array to the field of the myArrays class
                                        // Присваиваем переданный массив в поле класса myArrays

    }
    // Getter to get an array Геттер для получения массива
    public int[] getMyArrays() {
        return myArrays;
    }
    // Setter to modify the array Сеттер для изменения массива
    public void setMyArrays(int[] myArrays) {
        this.myArrays = myArrays;
    }

    @Override
    public String toString() {
        return "MyArrays{" +
                "myArrays=" + Arrays.toString(myArrays) +
                '}';
    }

    //  Method  the minimum element in an array
    //  Метод для минимального элемента в массиве
        public  int sucheMin(int[]myArrays) {
            int min = myArrays[0];//think that The first element  is minimal
                                        //думаем, что первый элемент — минимальный
            for (int i = 0; i < myArrays.length; i++) {
                if (myArrays[i] < min) {//If the current element is less than the minimum
                                        // Если текущий элемент меньше минимального
                    min = myArrays[i];  //Change the minimum value
                                        // меняем минимальное значение
                }
            }
            return min;// return min element
                        // Возвращаем минимальный элемент
        }

    // Метод для  максимального элемента в массиве
    public int sucheMaxx(int [] myArrays){

        int max = myArrays[0];  // the first element is the maximum
                                // думаем, что первый элемент — максимальный
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] > max) { //If the current element is greater than the maximum
                                    // Если текущий элемент больше максимального

                max = myArrays[i];//Change the max value
                                 // меняем макс значение
            }
        }
        return max; //return max element
                    // Возвращаем макс элемент
            }

            // Метод для поиска индекса максимального элемента
    public static int sucheMaxIndex(int[] myArrays) {

        int maxIndex = 0;           // the first element is the maximum
                                 // думаем, что первый элемент — максимальный
        for (int i = 0; i < myArrays.length; i++) {//Go through the array Проходим по массиву
            if (myArrays[i] > myArrays[maxIndex]) {//If the current item is larger than the index item maxIndex
                                                    // Если текущий элемент больше, чем элемент по индексу maxIndex

                maxIndex = i;        //Change the max value
                                     // меняем макс значение
            }
        }
        return maxIndex;
    }
    // Метод для поиска индекса минимального элемента
    public static int sucheMinIndex(int[] myArrays) {

        int minIndex = 0;
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] < myArrays[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}//end of class
