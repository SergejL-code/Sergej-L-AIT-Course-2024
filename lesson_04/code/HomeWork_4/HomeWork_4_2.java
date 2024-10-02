package HomeWork_4;

//Write a method that converts Celsius to Fahrenheit.

public class HomeWork_4_2 {
    public static void main(String[] args) {

        double tempCelsius = 23;                                                                //grad,   declared Variable
        double d = сonversionCelsiusToFahrenheit(tempCelsius);                                  // call of Methode cCTF
        System.out.println("The temperature of " + tempCelsius +"°С is " + d + "°F.");

    }//end of main

private static double сonversionCelsiusToFahrenheit (double tempCelsius){                       // start of Methode cCTF

        return tempCelsius * 9/5 + 32;
}

}//end of class
