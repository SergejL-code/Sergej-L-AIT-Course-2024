package HomeWork_3;


//A method for calculating the perimeter of a rectangle based on two sides

public class HomeWorkRectangle_3_3 {

    public static void main(String[] args) {

        int a = 1000;                                                                                // declared Variable

        int b = 2000;                                                                                // declared Variable

        int p = perimeterOfRectangle(a, b);                                                           // call of pOR Method

        System.out.println("Периметр прямоугольника со сторонами  " + a + " и " + b + " равен " + p);
    }                                                                                                   // end of main

    public static int perimeterOfRectangle(int a, int b) {                                      //start of  pOR Method

        return 2 * (a + b);
    }                                                                                                    // end of pOR Method
}                                                                                                        //end of class
