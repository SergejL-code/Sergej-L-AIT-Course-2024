package HomeWork_4;


//conversion currency


public class HomeWork_4_1 {
    public static void main(String[] args) {


        double amountOfMoney_Euro = 25;                                                                 //declared variables
        double amountOfMoney_Britisch_Pfund = 45;                                                       //declared variables
        double amountOfMoney_Chinese_Yuan = 81;                                                         //declared variables


        // Euro to Dollars

        double exchangDollars = conversionToDollars(amountOfMoney_Euro);                                // call of Methode cTD

        System.out.println("After conversions " + amountOfMoney_Euro + " Euro. You have " + exchangDollars + " Dollars.");


        //Euro to Britisch Pfund Sterling


        double exchangBF = conversionToBritisch_Pfund(amountOfMoney_Britisch_Pfund);                    // call of Methode cTBP

        System.out.println("After conversions " + amountOfMoney_Britisch_Pfund + " Euro. You have " + exchangBF + " Britisch Pfund Sterling.");


        //Euro to Chinese Yuan


        double exchangY = conversionToChinese_Yuan(amountOfMoney_Chinese_Yuan);                         // call of Methode cTCY


        System.out.println("After conversions " + amountOfMoney_Chinese_Yuan + " Euro. You have " + exchangY + " Chinese Yuan.");

    }//end of main

    private static double conversionToDollars(double euro) {                                            //start of Methode cTD
        return euro * 1.1;
    }

    private static double conversionToBritisch_Pfund(double bf) {                                       //start of Methode cTBP

        return bf * 0.84;
    }

    private static double conversionToChinese_Yuan(double y) {                                           //start of Methode cTCY
        return y * 7.87;
    }
}//end of class
