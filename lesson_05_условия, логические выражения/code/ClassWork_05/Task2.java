package ClassWork_05;

//Объявите две переменные целого типа a и b и присвойте им произвольные значения натуральных чисел.
//Создайте третью переменную res и выведите ее значение на экран таким образом:
//Если a = b, то res будет равно (a + b) * 5 a если нет, то (a - b) * 5

public class Task2 {
    public static void main(String[] args) {

        int a = 5;
        int b = -1;
        int res  ;

        if (a == b){

            res = (a + b) * 5;

        } else{
            res = (a - b) * 5;
        }

        System.out.println(res);

    }// end of main

}// end of class
