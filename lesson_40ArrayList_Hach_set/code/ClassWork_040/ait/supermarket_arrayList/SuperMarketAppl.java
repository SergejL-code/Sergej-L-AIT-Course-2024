package ClassWork_040.ait.supermarket_arrayList;

import ClassWork_040.ait.supermarket_arrayList.dao.SupermarketImpl;
import ClassWork_040.ait.supermarket_arrayList.model.Product;

import java.time.LocalDate;

public class SuperMarketAppl {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        SupermarketImpl myMarkt = new SupermarketImpl();


        Product[] products = new Product[5];
        products = new Product[5]; //элементов
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));//просрочен
        products[2] = new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));//просрочен
        for (Product product : products) {
            myMarkt.addProduct(product);
        }
//меню с опциями 1-склад, 2 - просрочка,3 - продукты по категорий, 4 - продукты по бренду, ...

        System.out.println("");
        Iterable<Product>res = myMarkt.findByCategory("bread");



    }//end of main

}//end of class
