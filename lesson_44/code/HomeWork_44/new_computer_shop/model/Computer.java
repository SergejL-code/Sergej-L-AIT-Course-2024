package HomeWork_44.new_computer_shop.model;

import java.util.Objects;

public class Computer {
    private final long id;
    private String brand;
    private String model;
    private int ram;
    private boolean discount;
    private double price;
    private String country;// Страна производителя
    private int year; // Год выпуска

    public Computer(long id, String brand, String model, int ram, boolean discount, double price, String country, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.discount = discount;
        this.price = price;
        this.country = country;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public boolean isDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return id == computer.id && year == computer.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", country='").append(country).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
