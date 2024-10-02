package ClassWork_05;

//Написать метод, возвращающий максимальное из двух целых чисел.
//  Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе**.
//  Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор***

public class Maximum {
    public static void main(String[] args) {

        // call of Method
int a = 5;
int b = 4;

int max_res = maximum(a,b);
        System.out.println("Maximum = " + max_res);

    }// end of main


    //start of Method
    private static int maximum (int a, int b){
        int max ;
        if( a >= b){
            max = a;
        }else {
            max = b;
        }
        return max;
    }
}//end of class
