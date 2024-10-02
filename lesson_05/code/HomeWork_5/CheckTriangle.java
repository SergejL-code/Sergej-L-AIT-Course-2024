package HomeWork_5;

//Define the three sides of the triangle in the program.
// Check the validity of the triangle inequality - any of the sides must be smaller the sum of the other two.
// Report the result - whether a triangle with the given sides exists or not.
public class CheckTriangle {
    public static void main(String[] args) {

// call of Method, declared Variable
        int one_Side = 6;
        int two_Side = 6;
        int three_Side = 4;
        boolean res = existsTriangle(one_Side, two_Side, three_Side);
        System.out.println("This triangle with the sides a = " + one_Side + " ;b= " + two_Side + " ;c = " + three_Side + " exists." + res);

    }//end of main

// start of Method

    private static boolean existsTriangle(int a, int b, int c) {
       return (a < c + b && b < a + c && c < a + b);

    }

}//end of class
