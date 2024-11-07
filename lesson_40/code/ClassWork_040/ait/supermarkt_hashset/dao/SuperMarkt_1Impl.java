package ClassWork_040.ait.supermarkt_hashset.dao;

import ClassWork_040.ait.supermarkt_hashset.model.Product_1;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class SuperMarkt_1Impl implements SuperMarkt_1 {

    private Collection<Product_1>product1s=new HashSet<>();
    @Override
    public boolean addProduct_1(Product_1 product_1) {
        if (product_1 == null ) {
            return false;}
        return product1s.add(product_1);

    }

    @Override
    public Product_1 removeProduct_1(long barCode) {
        Product_1 product_1 = findByBarCode(barCode);
        product1s.remove(product_1);
        return product_1;

    }

    @Override
    public Product_1 findByBarCode(long barCode) {
        for (Product_1 p : product1s) {
        if( p.getBarCode()==barCode){//потому что примитив
            return p;
        }
    }
        return null;

    }

    @Override
    public Iterable<Product_1> findByCategory(String category) {
        return findByPredicate(product-> product.getCategory().equalsIgnoreCase(category));// так как String;
    }

    @Override
    public Iterable<Product_1> findByBrand(String brand) {
        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product_1> findProductsWithExpiredDate() {
        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return product1s.size();
    }

    @Override
    public Iterator<Product_1> iterator() {
        return product1s.iterator();
    }
    private Iterable<Product_1>findByPredicate(Predicate<Product_1> predicate){
        Set<Product_1> res = new HashSet<>();
        for (Product_1 p : product1s) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return  res;
    }
}
