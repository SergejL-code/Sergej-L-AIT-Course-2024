package HomeWork_3;

public class HomeWork_3_4 {
    public static void main(String[] args) {

        //The value of the 3rd angle of a triangle based on the first two.

        double angle_a = 68;  //grad                                                         //declared Variable
        double angle_b = 54;  //grad                                                         //declared Variable
        double angle_c = thridCorner(angle_a, angle_b);                                      // call of Method tC
        System.out.println("The third corner of the triangle is " + angle_c);

        // The area of a triangle based on the side and height of the triangle.

        double triangleSide = 34;                                                             //declared Variable
        double heightOfTriangle = 15;                                                         //declared Variable
        double area = areaOfTriangle(triangleSide, heightOfTriangle);                         //call of Method aOT
        System.out.println("The area of a triangle based on the side and height of the triangle is " + area);

        //The hypotenuse based on two legs (Pythagoras' theorem).

        double side_one = 14;                                                                  //declared Variable
        double side_two = 28;                                                                  //declared Variable
        double hypo = hypotenuse(side_one, side_two);
        System.out.println("The hypotenuse is " + hypo);                                       // call of Method hypotenuse
    }//end of main

    private static double thridCorner(double angle_a, double angle_b) {                        //start of Method tC
        double sum = 180;                                                                      //  Sum of Angeles
        return sum - (angle_a + angle_b);
    }

    private static double areaOfTriangle(double side, double height) {                         //start of Method aOT
        return side * height / 2;
    }

    private static double hypotenuse(double side_one, double side_two) {                        //start of Method hytotenuse
        double lengthsOfTwoSides = Math.pow(side_one, 2) + Math.pow(side_two, 2);
        return Math.sqrt(lengthsOfTwoSides);
    }

}//end of class
