package Supermarkt.model;

import java.util.Objects;

public abstract class Product {
    private String id; // Barcode
    private String name;
    private String category;
    private String expiryDate; // In the format yyyy-MM-dd
    private double price;

    public Product(String id, String name, String category, String expiryDate, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && Objects.equals(id, product.id) && Objects.equals(expiryDate, product.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, expiryDate, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", expiryDate='").append(expiryDate).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
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