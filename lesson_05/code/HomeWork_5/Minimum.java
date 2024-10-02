package HomeWork_5;

// Write a method that returns the minimum of two integers. The numbers are specified in the program.

public class Minimum {
    public static void main(String[] args) {

        // call of Method, declared Variable

        int a = 3 ;
        int b = 3;
        int res_min = minimum(a, b);
        System.out.println("Minimum = " + res_min);
    }//end of main

// start of Method

    public static int minimum(int a,int b) {
        int min;

        if (a <= b) {
            min = a;

        } else {
            min = b;

        } return min;
    }

}//end of class
