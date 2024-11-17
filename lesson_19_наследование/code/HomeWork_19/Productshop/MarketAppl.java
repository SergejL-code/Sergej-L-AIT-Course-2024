package HomeWork_19.Productshop;

/* Task 1. Create a class Product, with fields:
private double price
private String name
private long barCode
Create a Food class that extends the Product class with a private String expDate field that stores the expiration date. Create a MeatFood class extending the Food class with a private String meatType field that stores the type of meat from which the product is manufactured. Create a MilkFood class extending the Food class with private String milkType fields, private double fat, which store the type of milk and fat content of the product, respectively. In all classes, override the toString method. In the main method, create an array that stores one object for each product. Create a method that prints all products from the array, and a method that returns the sum of the prices of all products.
Task 2. In Task 1, override the equals method to compare objects. In the ProductsAppl class, create a method that prints all non-food products to the console. In the ProductsAppl class, create a method that accepts a barcode and returns a product with this barcode. In the main method, call new methods. Print the result of their work to the console.*/
/* 1. Создать класс Product, с полями:

private double price
private String name
private long barCode; Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString. Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
печатающий все продукты из массива, и
метод возвращающий сумму цен всех продуктов.
Задача 2. В Задаче 1 переопределить метод equals для сравнения объектов во всех классах. В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.

Задача 3. (*) В классе MarketAppl создать метод печатающий в консоль все не пищевые продукты.*/

import HomeWork_19.Productshop.modele.Food;
import HomeWork_19.Productshop.modele.MeatFood;
import HomeWork_19.Productshop.modele.MilkFood;
import HomeWork_19.Productshop.modele.Product;

import java.util.Scanner;

public class MarketAppl {


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

}//end of class
