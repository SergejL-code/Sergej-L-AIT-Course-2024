package HomeWork_3;

//the area of a circle for R = 200

public class HomeWorkCircle_3_2 {

    public static void main(String[] args) {

        int r = 200;                                                                                // declared Variable
        int s = areaOfCircleMethod(r);                                                              // call of Method aOS

        System.out.println("Площадь круга для r " + r + " равна " + s);

    }                                                                                               // end of main

    private static int areaOfCircleMethod(int r) {                                                  //start of Method aOCM

       return (int) (Math.PI * Math.pow(r, 2));

    }

}                                                                                                   //end of class
