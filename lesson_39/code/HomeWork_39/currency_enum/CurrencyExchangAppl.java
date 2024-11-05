package HomeWork_39.currency_enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyExchangAppl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("welcome to the currency exchange office");
        System.out.println("****************************************************");

        ArrayList<Currency> currencyList = new ArrayList<>(Arrays.asList(Currency.values()));

            for (Currency currency : currencyList) {
                System.out.println(currency);
            }
            System.out.println("******************************************************************");

            System.out.println("Input the number of the currency you want to exchange: ");
            int choice = scanner.nextInt()-1;


            System.out.println("Input the amount:");
            double amount = scanner.nextDouble();


            if (choice >=0 && choice < currencyList.size()) {
                Currency selCurrency = currencyList.get(choice);

                double euros = convertToEuro(amount, selCurrency);
                System.out.printf("You'll receive %.2f EUR.%n", euros);

            } else {
                System.out.println("Invalid currency selection.");
            }



    }

    private static double convertToEuro(double amount, Currency currency) {
        return amount / currency.getRate();
    }

}//end of class




