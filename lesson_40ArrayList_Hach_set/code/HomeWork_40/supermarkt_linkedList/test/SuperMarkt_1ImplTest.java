package HomeWork_40.supermarkt_linkedList.test;

import HomeWork_40.supermarkt_linkedList.dao.SuperMarkt_1;
import HomeWork_40.supermarkt_linkedList.dao.SuperMarkt_1Impl;
import HomeWork_40.supermarkt_linkedList.model.Product_1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SuperMarkt_1ImplTest {
SuperMarkt_1 superMarkt1;
Product_1[] product1s;
LocalDate now = LocalDate.now();
    @BeforeEach
    void setUp() {
        superMarkt1=new SuperMarkt_1Impl();
        product1s= new Product_1[5];
        product1s[0] = new Product_1(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        product1s[1] = new Product_1(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));//просрочен
        product1s[2] = new Product_1(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        product1s[3] = new Product_1(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        product1s[4] = new Product_1(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));//просрочен

        for (Product_1 product : product1s) {
            superMarkt1.addProduct_1(product);
        }
    }

    @Test
    void testAddProduct_1() {
        assertFalse(superMarkt1.addProduct_1(null));
        assertFalse(superMarkt1.addProduct_1(product1s[3]));
        Product_1 product1 = new Product_1(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(superMarkt1.addProduct_1(product1));
        assertEquals(6, superMarkt1.skuQuantity());
        Product_1 product2 = new Product_1(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(superMarkt1.addProduct_1(product2)); // с одинаковым баркодом
        Product_1 product3 = new Product_1(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(superMarkt1.addProduct_1(product3));
    }

    @Test
    void testRemoveProduct_1() {
        assertEquals(product1s[1], superMarkt1.removeProduct_1(222222));
        assertEquals(4, superMarkt1.skuQuantity());
        assertNull(superMarkt1.removeProduct_1(222222)); // дважды не можем удалить
    }

    @Test
    void testFindByBarCode() {
        assertEquals(product1s[1], superMarkt1.findByBarCode(222222));
        assertNull(superMarkt1.findByBarCode(888888));
    }

    @Test
    void testFindByCategory() {
        LinkedList<Product_1> actual = (LinkedList<Product_1>) superMarkt1.findByCategory("Bread");// безопасный кастинг
        int l = actual.size();
        Product_1[] productsActual = new Product_1[l];
        //перекладываем из List в массив
        int i = 0;
        for (Product_1 product : actual) {
            productsActual[i] = product;
            i++;
        }
        Product_1[] expected = {product1s[0], product1s[4]};
        assertArrayEquals(expected, productsActual);
    }

    @Test
    void testFindByBrand() {
        Iterable<Product_1> actual = superMarkt1.findByBrand("Kolosok");
        Iterable<Product_1> expected = Arrays.asList(product1s[0], product1s[4]);
        assertIterableEquals(actual, expected);
    }

    @Test
    void testFindProductsWithExpiredDate() {
        Iterable<Product_1> actual = superMarkt1.findProductsWithExpiredDate();
        Iterable<Product_1> expected = Arrays.asList(product1s[1], product1s[4]);
        assertIterableEquals(actual, expected);
    }

    @Test
    void testSkuQuantity() {
        assertEquals(5, superMarkt1.skuQuantity());
    }


}