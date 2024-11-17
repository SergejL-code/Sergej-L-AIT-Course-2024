package ClassWork_019.computershop_2;

public class Computer_2 {

  private String cpuName;
  private int ram;
  private int ssd;
  private String brand;
  private double price;

  public Computer_2(String cpuName, int ram, int ssd, String brand, double price) {
    this.cpuName = cpuName;
    this.ram = ram;
    this.ssd = ssd;
    this.brand = brand;
    this.price = price;

  }
  public String getCpuName() {
    return cpuName;
  }
  public void setCpuName(String cpuName) {
    this.cpuName = cpuName;
  }
  public int getRam() {
    return ram;
  }
  public void setRam(int ram) {
    this.ram = ram;
  }
  public int getSsd() {
    return ssd;
  }
  public void setSsd(int ssd) {
    this.ssd = ssd;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  @Override
  public String toString() {
    return "Computer_2{" +
            "cpuName='" + cpuName + '\'' +
            ", ram=" + ram +
            ", ssd=" + ssd +
            ", brand='" + brand + '\'' +
            ", price=" + price +
            '}';
  }
}