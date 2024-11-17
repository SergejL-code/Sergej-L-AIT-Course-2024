package ClassWork_06;

//Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
//- сумма покупки до 100 евро - скидка 0%
//- сумма покупки от 101 евро до 200 евро - скидка 2%
//- сумма покупки от 201 евро до 500 евро - скидка 5%
//- сумма покупки от 501 евро до 1000 евро - скидка 10%
//- сумма покупки от более 1000 евро - скидка 20%
//Сумма покупки вводится с клавиатуры.

import java.util.Scanner;

public class Discounts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amout of purchase: ");
        double sumPurchase = scanner.nextDouble();

        double discount = 0; //discount(sumPurchase);

        if (sumPurchase > 0 && sumPurchase<=0){
            discount = 0;
        } else if (sumPurchase>100 && sumPurchase<=200) {
            discount = 0.02;
        } else if (sumPurchase>200 && sumPurchase<=500) {
            discount = 0.05;
        } else if (sumPurchase>500 && sumPurchase<= 1000) {
            discount = 0.1;
        } else if (sumPurchase> 1000 ) {
            discount = 0.2;
        }
        System.out.println(discount);

    }//end of main


}//end of class
