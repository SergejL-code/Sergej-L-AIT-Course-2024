package HomeWork_5;

//Calculate the purchase of discounted items.
//Product A costs X euros and has a D% discount, and product B costs Y euros and has a C% discount.
//The client took N goods A and M goods B. If the purchase amount exceeds 100 euros, then an additional 5% discount is granted.
//Calculate the total cost of the purchase and the amount of the discount received.

// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Discount {


    public static void main(String[] args) {

        double productQuantity_N = 1;                                                                                       // The client took
        double productQuantity_M = 8;                                                                                       // The client took
        double productPrice_X = 3;                                                                                          // Price
        double productPrice_Y = 44;                                                                                         // Price
        double discount_D = 5;                                                                                             // Prozent
        double discount_C = 2.5;                                                                                            // Prozent



        double sumPurhaseWithDiscount = sumPurhaseWithDiscount(productPrice_X, discount_D, productPrice_Y, discount_C, productQuantity_N, productQuantity_M);

        System.out.println("The total cost of the purchase " + sumPurhaseWithDiscount + " and the amount of the discount ");

    }//end of main


    private static double sumPurhaseWithDiscount(double productPrice_X, double discount_D, double productPrice_Y, double discount_C, double productQuantity_N, double productQuantity_M) {

        double dP_A = productPrice_X - (productPrice_X * discount_D) / 100;   //Price with Discount

        double dP_B = productPrice_Y - (productPrice_Y * discount_C) / 100;   // Price whit Discount

        return productQuantity_N * dP_A + productQuantity_M * dP_B;

    }

    private static double sumPurchase(double sumPurhaseWithDiscount) {
        if (sumPurhaseWithDiscount >= 100) {
            double v = sumPurhaseWithDiscount - (sumPurhaseWithDiscount * 5) / 100;
            return v;
        } // end   if
        return sumPurhaseWithDiscount;
    }

} //end of class






