package ClassWork_040.ait.supermarket_arrayList.dao;

import ClassWork_040.ait.supermarket_arrayList.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class SupermarketImpl implements Supermarket {

    private Collection<Product> products = new ArrayList<>();


    @Override
    public boolean addProduct(Product product) {
        if (product == null || products.contains(product)) {
        return false;}
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {

        Product product= findByBarCode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
           if( product.getBarCode()==barCode){//потому что примитив
               return product;
           }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {


        return findByPredicate(product-> product.getCategory().equalsIgnoreCase(category));// так как String
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {

        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    private Iterable<Product>findByPredicate(Predicate<Product>predicate){
        List<Product>res = new ArrayList<>();
        for (Product p : products) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return  res;
    }
}
