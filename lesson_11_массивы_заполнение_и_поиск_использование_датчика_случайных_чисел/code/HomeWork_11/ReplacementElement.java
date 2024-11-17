package HomeWork_11;

//Given an array of integers: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83. Find the maximum array element and its index.
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83. Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.

public class ReplacementElement {
    public static void main(String[] args) {
        int[] number = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int maxIndex = 0;
        int maxNumber = number[0];

        // the maximum element and its index(максимального элемента и его индекса)
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
                maxIndex = i;
            }//end of if

            System.out.print(number[i] + " ");//  the current element of the array(Вывод текущего элемента массива )
        }
        System.out.println();

        System.out.print("The maximum element " + maxNumber + " of the array and its index: " + maxIndex);

        System.out.println();
        // the maximal element to the first place(Перестановка макс. элемента на первое место)
        int temp = number[maxIndex];//Saving the maximum element(Сохраняем макс. элемент)
        number[maxIndex] = number[0];// Move the first element to the maximum location (Перемещаем первый элемент на место максимального)
        number[0] = temp; //  Put the maximum element in first place(Макс. элемент ставим на первое место)

        //  array after replacement( массива после замены)
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }
    }//end of main
}//end of class
