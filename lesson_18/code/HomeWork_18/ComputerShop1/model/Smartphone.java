package HomeWork_18.ComputerShop1.model;

public class Smartphone extends LaptopA {
    //fields
    private long imei;
//constructor


    public Smartphone(String cpuName, int ram, int ssd, String brand, double price, long imei) {
        super(cpuName, ram, ssd, brand, price);
        this.imei = imei;
    }

//Getters and Setters
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
