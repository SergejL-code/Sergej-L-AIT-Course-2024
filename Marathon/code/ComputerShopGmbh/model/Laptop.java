package ComputerShopGmbh.model;

import java.util.Objects;

public class Laptop extends GeneralDevice {

    private double displaySize;
    private  double weight;
    private int batteryLife;
    private String color;

    public Laptop(long id, String brand, String model, int ram, boolean discount, double price, double displaySize, double weight, int batteryLife, String color) {
        super(id, brand, model, ram, discount, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(displaySize, laptop.displaySize) == 0 && Double.compare(weight, laptop.weight) == 0 && batteryLife == laptop.batteryLife && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displaySize, weight, batteryLife, color);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double calcPriceWithRabatt() {
        return 0;
    }
}
