package HomeWork_08;

//Print out all natural numbers less than 200 and multiples of 13.
//Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.
public class NaturalNumbersWithWhile {
    public static void main(String[] args) {

        int n = 13;

        while (n < 13) {
            System.out.print(n + " ");
            n = n + 13;//n+=13

        }//end of while
        System.out.println("The end.");
    }// end of main

}//end of class
