package ClassWork_10;
//**Задача 1.**
//Создайте массив и заполните его целыми числами от 1 до 20.

public class Massiv {
    public static void main(String[] args) {
        int[] numbers = new int[20];//lenth = 20,indexes from 0 till 19

        // numbers[0] 1st element of array
        //numbers.length = 20
        //numbers[numbers. length - 1]

        //fiil in
        for (int i = 0; i < numbers.length; i++) {  //index = 0
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }//end of for

        //print array numbers
       // for (int i = 0; i < numbers.length; i++) {
         //   System.out.print(numbers[i] + " ");
       // }
        System.out.println();
        System.out.println(numbers );//link
    }//end of main

}//end of class
