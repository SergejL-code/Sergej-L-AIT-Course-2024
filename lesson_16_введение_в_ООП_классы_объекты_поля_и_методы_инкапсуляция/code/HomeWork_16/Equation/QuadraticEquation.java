package HomeWork_16.Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

   // Constructor to initialize the coefficients a, b, and c

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Getter and Setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    // Calculation of discriminants
    public static double delta(double a, double b, double c) {
        if (a != 0) {
            return b * b - (4 * a * c);
        }
        return -1;// Not a quadratic equation
    }
   // Method to calculate and print the roots of the quadratic equation

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    // Method to calculate and print the roots of the quadratic equation
    public static double quantityRoots(double a, double b, double c) {
        double discriminant = delta(a, b, c);
        if (delta(a, b, c) > 0) {

            double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b - Math.sqrt(discriminant));
            System.out.println("Roots are real and different: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta(a, b, c) == 0) {
            double x = -b / 2 * a;
            System.out.println("Roots are real and the same: x = " + x);
        } else {
            System.out.println(" the equation has no real roots !!!");

        }

        return discriminant;
    }

}//end of class