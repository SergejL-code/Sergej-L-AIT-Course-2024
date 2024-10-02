package ClassWork_04;

public class MathMethods {
    public static void main(String[] args) {

        // exchangDollars

        double money = 500;                                                                                    //dollars
        double euro = exchangDollarsToEuro(money);                                                             //call of Method eDTE
        System.out.println("Euro: " + euro);                                                                   // printing Euro


        // menge eat Collory

        double weight = 200;                                                                                   //declared variables,  gramm
        double calorage = 50;                                                                                  //declared variables, calorie on 100 gramm

        double energy = calculateCalorie(weight, calorage);                                                    // start of Method cCa
        System.out.println("Energy : " + energy);                                                              // printing Energy

        // Fuel

        double fuel = 52;   // liter
        double distance = 480;  // km

        double consumption = calculateConsumpition(fuel, distance);                                            // call of Method cCo
        System.out.println("Consumption: " + consumption);                                                      // printing consumption

    }                                                                                                            // end of main

    private static double exchangDollarsToEuro(double money) {                                                   // start of Method eDTE

        double rate = 0.9;

        return money * rate;


    }                                                                                                           // end of Method eDTE

    private static double calculateCalorie(double weight, double calorage) {                                    // start of Method cC

        return weight * calorage / 100;
    }

    private static double calculateConsumpition(double fuel, double distance) {

        return (fuel / distance) * 100;

    }

}                                                                                                                //end of class
