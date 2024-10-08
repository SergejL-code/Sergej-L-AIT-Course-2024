package ClassWork_019.computershop_2;

public class Smartphone_2 extends Laptop_2 {
    private long imei;

    public Smartphone_2(String cpuName, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
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
        return "Smartphone_2{" +
                "imei=" + imei +
                "} " + super.toString();
    }
}
