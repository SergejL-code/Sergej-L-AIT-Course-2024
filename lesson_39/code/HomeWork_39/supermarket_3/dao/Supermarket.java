package HomeWork_39.supermarket_3.dao;

import HomeWork_39.supermarket_3.model.Product;

public interface Supermarket extends Iterable<Product> {
    boolean addProduct(Product product);

    Product removeProduct(long barCode);

    Product findByBarCode(long barCode);

    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product >findProductsWithExpiredDate();
    int skuQuantity();

}
