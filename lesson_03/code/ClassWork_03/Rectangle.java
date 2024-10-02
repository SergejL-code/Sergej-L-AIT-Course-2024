package ClassWork_03;
//Вычислить площадь прямоугольника.
//Задайте длину и ширину прямоугольника как переменные типа double.
// Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.


public class Rectangle {                                                                                //start of class


    public static void main(String[] args) {                                                            //start of main

        double a = 125.37d;                                                                                     //declared variables
        double b = 35.0d;                                                                                       //declared variables


        //Solution 1

        double area = a * b;
        System.out.println("Area of rectangle: " + area);


        // Solution with Method

        area = areaofRectangle(a, b);
        System.out.println(area);


    }                                                                                                   //end of main

    public static double areaofRectangle(double a, double b) {                                           // start Method aoR with type of data

        double res = a * b;                                                                            //declared variables
        return res;
    }

}                                                                                                       //end of class
