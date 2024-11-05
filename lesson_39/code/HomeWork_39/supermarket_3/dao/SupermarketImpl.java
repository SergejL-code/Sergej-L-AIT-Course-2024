package HomeWork_39.supermarket_3.dao;

import HomeWork_39.supermarket_3.model.Product;

import java.util.Collection;
import java.util.Iterator;


public class SupermarketImpl implements Supermarket {

Collection<Product>products;
    public SupermarketImpl() {
        this.products = products;
    }

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return 0;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }
}
