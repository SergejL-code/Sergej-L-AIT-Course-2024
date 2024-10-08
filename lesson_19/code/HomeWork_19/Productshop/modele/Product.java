package HomeWork_19.Productshop.modele;

import java.util.Objects;

public class Product {
    //fields(Attributes)
    private double price;
    private String name;
    private long barCode;

    //constructtor
    public Product(long barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    //Getter and Setter
    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //displaying
    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }
}//end of main
