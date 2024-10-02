package HomeWork_4;

//Create a method that converts nautical miles to kilometers.

public class HomeWork_4_3 {

    public static void main(String[] args) {

        double distanceNauticalMiles = 34;                                                              // declared Variable

        double km = convertsNauticalMiles(distanceNauticalMiles);                                       // call of Methode cNM

        System.out.println(distanceNauticalMiles + " nautical miles is " + km +" kilometers");


    }//end of main


    private static double convertsNauticalMiles(double distanceNauticalMiles) {                         //start of Method cNM
        double K = 1.852;
        return distanceNauticalMiles * K;
    }
}//end of class
