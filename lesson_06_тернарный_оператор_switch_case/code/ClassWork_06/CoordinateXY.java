package ClassWork_06;

//Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
//  Определите в какую четверть попадает точка с этими координатами.

public class CoordinateXY {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        if (x >= 0 & y >= 0) {
            System.out.println("Point is in 1st quarter");
        }

        if (x <= 0 & y >= 0) {
            System.out.println("Point is in 2nd quarter");

        }
        if (x <= 0 & y <= 0) {
            System.out.println("Point is in 3rd quarter");

            if (x >= 0 & y <= 0) {
                System.out.println("Point is in 4th quarter");

            }
            if (x == 0 & y == 0) {
                System.out.println("Point is in(0;0)");
            }

//            x = -5;
//            y = -4;
//
//
//            if ((x >= 0) && (y >= 0)) {
//                System.out.println("точка в первой четверти");
//            } else if ((x < 0) && (y >= 0)) {
//                System.out.println("точка во второй четверти");
//            } else if ((x < 0) && (y < 0)) {
//                System.out.println("точка во третьей четверти");
//            } else {
//                System.out.println("точка во третьей четверти");
            }

 //       }
    }  //end of main
}//end of class