package ClassWork_019.computershop_2;

public class Laptop_2 extends Computer_2 {

private double displaySize;
private  double weight;
private int batteryLife;
private String color;

    public Laptop_2(String cpuName, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color) {
        super(cpuName, ram, ssd, brand, price);
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
    public String toString() {
        return "Laptop_2{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
