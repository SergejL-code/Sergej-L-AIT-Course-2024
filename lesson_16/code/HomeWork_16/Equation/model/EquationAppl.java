package HomeWork_16.Equation.model;


import HomeWork_16.Equation.QuadraticEquation;

import java.util.Scanner;

public class EquationAppl {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a: ");
        double a = scanner.nextDouble();
        System.out.println("Input number b: ");
        double b = scanner.nextDouble();
        System.out.println("Input number c: ");
        double c = scanner.nextDouble();
    // Create an instance of QuadraticEquation using the input values
        QuadraticEquation numbers = new QuadraticEquation(a, b, c);
    // Calculate the discriminant with the delta method
        double discriminant = QuadraticEquation.delta(a, b, c);
        //  Call the quantityRoots method
        double validRoot = QuadraticEquation.quantityRoots(a,b,c);
        // Print the discriminant
        System.out.println( " discriminant is " + discriminant );

    }//end of main


}//end of class

