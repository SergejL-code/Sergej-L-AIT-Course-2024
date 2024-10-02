package HomeWork_10;
//Fill the array with even numbers from 0 to 50.
// Print the array in ascending order, then in descending order.

//      Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50.
//      Распечатать массив в порядке возрастания, затем в порядке убывания.

public class EvenNumbers {
    public static void main(String[] args) {
        int[] evenNumber = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50};
//array in ascending order
        for (int i = 0; i < evenNumber.length; i++) {
            System.out.print(evenNumber[i] + " ");
        }
        System.out.println();
// array descending order
        for (int i = evenNumber.length -1; i >= 0; i--) {
            System.out.print(evenNumber[i] + " ");
        }
    }//end of main
}//end of class
