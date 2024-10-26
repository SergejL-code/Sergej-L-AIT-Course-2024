package ComputerShopGmbh.model;

import java.util.Objects;

public abstract class Device {
    private int id;
    private String brand;
    private String model;
    private int ram;
    private boolean discount;
    private double price;

    public Device(int id, String brand, String model, int ram, boolean discount, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.discount = discount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
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
        Device device = (Device) o;
        return id == device.id && ram == device.ram && discount == device.discount && Double.compare(price, device.price) == 0 && Objects.equals(brand, device.brand) && Objects.equals(model, device.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, ram, discount, price);
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", discount=" + discount +
                ", price=" + price +
                '}';
    }
    public abstract double calcPriceWithRabatt();
}
