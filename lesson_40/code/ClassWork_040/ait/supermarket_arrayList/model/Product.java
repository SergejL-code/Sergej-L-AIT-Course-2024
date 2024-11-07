package ClassWork_040.ait.supermarket_arrayList.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private long barCode;
    private  String name;
    private  String category;
    private String brand;
    private double price;
    private LocalDate expDate;
    // Constructor with all arguments
    public Product(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }
    // Getters
    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }
    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    //toString for printing
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("barCode=").append(barCode);
        sb.append(", name='").append(name).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", expDate=").append(expDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }
}
