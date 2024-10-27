package ComputerShopGmbh.model;

import java.util.Objects;

public abstract class GeneralDevice {
    private long id;
    private String brand;
    private String model;
    private int ram;
    private boolean discount;
    private double price;

    public GeneralDevice(long id, String brand, String model, int ram, boolean discount, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.discount = discount;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        if (!(o instanceof GeneralDevice that)) return false;
        return id == that.id && ram == that.ram && discount == that.discount && Double.compare(price, that.price) == 0 && Objects.equals(brand, that.brand) && Objects.equals(model, that.model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Device{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, ram, discount, price);
    }

    public abstract double calcPriceWithRabatt();
}
