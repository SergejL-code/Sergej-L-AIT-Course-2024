package ComputerShopGmbh.model;

public class Laptop extends Computer {

    private double displaySize;
    private  double weight;
    private int batteryLife;
    private String color;

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

    public Laptop(String id, String brand, String model, double price, boolean discount, double displaySize, double weight, int batteryLife, String color) {
        super(id, brand, model, price, discount);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("displaySize=").append(displaySize);
        sb.append(", weight=").append(weight);
        sb.append(", batteryLife=").append(batteryLife);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
