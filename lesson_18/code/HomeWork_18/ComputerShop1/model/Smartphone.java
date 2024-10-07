package HomeWork_18.ComputerShop1.model;

public class Smartphone extends LaptopA {
    private long imei;

    public Smartphone(String cpuName, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
        super(cpuName, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imei = imei;

    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                "} " + super.toString();
    }

}//end of class
