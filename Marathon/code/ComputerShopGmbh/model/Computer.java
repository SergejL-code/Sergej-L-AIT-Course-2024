package ComputerShopGmbh.model;

import java.util.Objects;

public class Computer extends Device {
    private String from_factor;
    private String gpu;
    private double price;

    public Computer(int id, String brand, String model, int ram, boolean discount, double price, String from_factor, String gpu, double price1) {
        super(id, brand, model, ram, discount, price);
        this.from_factor = from_factor;
        this.gpu = gpu;
        this.price = price1;
    }

    public String getFrom_factor() {
        return from_factor;
    }

    public void setFrom_factor(String from_factor) {
        this.from_factor = from_factor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return Double.compare(price, computer.price) == 0 && Objects.equals(from_factor, computer.from_factor) && Objects.equals(gpu, computer.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), from_factor, gpu, price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "from_factor='" + from_factor + '\'' +
                ", gpu='" + gpu + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double calcPriceWithRabatt() {
        return 0;
    }
}
