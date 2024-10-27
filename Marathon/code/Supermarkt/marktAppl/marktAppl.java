package Supermarkt.marktAppl;

import HomeWork_19.Productshop.modele.Food;
import HomeWork_19.Productshop.modele.MeatFood;
import HomeWork_19.Productshop.modele.MilkFood;
import HomeWork_19.Productshop.modele.Product;

import java.util.Scanner;

public class marktAppl {
    public static void main(String[] args) {



            Product[] lebensmittels = new Product[7];
            lebensmittels[0] = new Product(123, "Fork", 5.60);
            lebensmittels[1] = new MeatFood(345, "ChickenGold", 3.55, "12.07.2022", "Chicken");
            lebensmittels[2] = new Food(567, "grünBohnen", 1.29, "15.2.2030");
            lebensmittels[3] = new MilkFood(789, "CowFeld", 0.99, "12.12.2023", 3.5, "Voll");
            lebensmittels[4] = new Product(321, "Dosen", 2.89);
            lebensmittels[5] = new MeatFood(687, "Lecker", 5.59, "12.07.2022", "Cattle");
            lebensmittels[6] = new Food(88888, "SchwarzStadt", 2.20, "13.13.2013");

            //prints all products

            for (int i = 0; i < lebensmittels.length; i++) {
                System.out.println("=====================================================================================");
                System.out.println(lebensmittels[i]);
                System.out.println("=======================================================================================");
            }

            //total Price

            double totalPrice = 0;
            for (int i = 0; i < lebensmittels.length; i++) {
                totalPrice += lebensmittels[i].getPrice();
            }
            System.out.printf(" The prices of all products: %.2f ", totalPrice);
            System.out.println();
            System.out.println("==================================================================================================================");

            // accepts a barcode and returns a product with this barcode( метод принимающий баркод и возвращающий продукт с данным баркодом)


            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Bar-code(only Digit): ");
            long barCodeIn = scanner.nextLong();

            for (int i = 0; i < lebensmittels.length; i++) {
                if (lebensmittels[i].getBarCode() == barCodeIn) {
                    System.out.println("Product with barcode " + barCodeIn + " found: " + lebensmittels[i]);
                } break;

            }

            System.out.println("===========================================================================================================");
            // prints all non-food products

            for (int i = 0; i < lebensmittels.length; i++) {

                if (!(lebensmittels[i] instanceof Food) &&              //The object does not belong to any of these classes
                        !(lebensmittels[i] instanceof MeatFood) &&
                        !(lebensmittels[i] instanceof MilkFood)) {

                    System.out.println(lebensmittels[i]);
                }//end of if
            }

        }//end of main

    }

