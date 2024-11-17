package HomeWork_40.supermarkt_linkedList.dao;

import HomeWork_40.supermarkt_linkedList.model.Product_1;

public interface SuperMarkt_1 extends Iterable<Product_1>{
    boolean addProduct_1(Product_1 product_1);
    Product_1 removeProduct_1(long barCode);

    Product_1 findByBarCode(long barCode);

    Iterable<Product_1> findByCategory(String category);
    Iterable<Product_1> findByBrand(String brand);
    Iterable<Product_1>findProductsWithExpiredDate();
    int skuQuantity();//это
}
