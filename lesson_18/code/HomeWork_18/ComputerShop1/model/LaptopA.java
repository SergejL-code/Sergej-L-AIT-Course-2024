package HomeWork_18.ComputerShop1.model;

public class LaptopA extends ComputerA{
//fields

private double displaySize;
private  double weight;
private int batteryLife;
private String color;

//constructor
    public LaptopA(String cpuName, int ram, int ssd, String brand, double price) {
        super(cpuName, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }
//Getters and Setters
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
        return "LaptopA{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
