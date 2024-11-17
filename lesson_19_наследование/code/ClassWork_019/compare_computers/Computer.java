package ClassWork_019.compare_computers;

import java.util.Objects;

public class Computer {

  private String cpuName;
  private int ram;
  private int ssd;
  private String brand;
  private double price;

  public Computer(String cpuName, int ram, int ssd, String brand, double price) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Computer computer)) return false;
      return ram == computer.ram && ssd == computer.ssd && Double.compare(price, computer.price) == 0 && Objects.equals(cpuName, computer.cpuName) && Objects.equals(brand, computer.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuName, ram, ssd, brand, price);
  }
}