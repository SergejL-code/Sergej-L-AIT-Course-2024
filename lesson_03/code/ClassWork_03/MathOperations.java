package ClassWork_03;
//Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты
// вместе с текстовыми пояснениями:
// - какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.
public class MathOperations {                                                                       //start of class

    public static void main(String[] args) {                                                        //start of main

      int x = 38;                                                                                   //declared variables
        int y = 63;                                                                                 //declared variables

        System.out.println(x+y);

       int res = x+y;                                                                               //declared variables

        System.out.println("x = " + x + " addition y = " + y + " Gesamt: " + res);                  // printing

        res = x-y;

        System.out.println("x = " + x + " - y = " + y + " = " + res );                              // printing

        // division
        res = y / x;                                                                                 // division (get the integer part from the division)
        System.out.println("y = " + y + " / x = " + x + " = " + res);

        res = y % x;                                                                                 // division (get the remainder of the division)
        System.out.println("y = " + y + " / x = " + x + " = " + res);

    }                                                                                               //end of main
}                                                                                                   //end of class
