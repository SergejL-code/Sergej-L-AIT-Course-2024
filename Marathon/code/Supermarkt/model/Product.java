package Supermarkt.model;

import java.util.Objects;

public abstract class Product {
    private String barcode; // id
    private String name;
    private String category;
    private String expiryDate; // In the format yyyy-MM-dd
    private double price;

    public Product(String barcode, String name, String category, String expiryDate, double price) {
        this.barcode = barcode;
        this.name = name;
        this.category = category;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(barcode, product.barcode) && Objects.equals(name, product.name) && Objects.equals(category, product.category) && Objects.equals(expiryDate, product.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, category, expiryDate, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", price=" + price +
                '}';
    }

}//end of class
//@Override
//public Product[] fillMarket(Product[] products) {
//    int count = 0;
//    for (int i = 0; i < products.length; i++) {
//        if(!(products[i] == null)){
//            count++;
//        }
//    }
//    for (int i = 0; i < count; i++) {
//        addProduct(products[i]);
//    }
//    return products;
//}