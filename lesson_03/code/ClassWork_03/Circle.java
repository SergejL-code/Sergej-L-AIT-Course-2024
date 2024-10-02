package ClassWork_03;
//Вычислить длину окружности по ее радиусу.
//Задайте радиус окружности как переменную типа double.
//Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу


public class Circle {

    public static void main(String[] args) {

// solution1


        double PI = 3.14159;

        double r = 100;

        double lenghtOfCircle = 2 * PI * r;

        System.out.println(lenghtOfCircle);


// Solution with Method

        double l = lenghtOfCircleMethod(r);                                             // declared Variable
        System.out.println("Length of circle with radius " + r + " = " + l);

    }//end of main

    private static double lenghtOfCircleMethod(double r) {                              //start lOСM Method

        return 2 * Math.PI * r;
    }


}// end of class
