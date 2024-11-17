package ClassWork_05;

//Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {
    public static void main(String[] args) {
//call of Method
        int a = 47;
        int b = 9;
        boolean res = isDivided(a, b);
        System.out.println("a = "+ a + ", b = " + b +" is divided: " + res);
    }//end of main

    // start of Method
    public static boolean isDivided(int a, int b) {
        return a % b == 0;

    }
}//end of class
