package HomeWork_3;

//A method for calculating the area of a square based on its side;

public class HomeWorkSquare_3_1 {
    public static void main(String[] args) {


        int a = 500;                                                                                 //declared Variable

        int area = areaOfSquare(a);                                                                 // call of Method aOS

        System.out.println("Площадь квадрата со стороной  " + a + " составляет " + area);

    }                                                                                               //end of main

    public static int areaOfSquare(int a) {                                                        //start of Method aOS

        int res = a * a;
        return res;

    }                                                                                               //end of Method aOS

}                                                                                                   //end of class
