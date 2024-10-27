package ComputerShopGmbh.model;

import java.util.Objects;

public class Computer extends GeneralDevice {
    private String formFactor;
    private String gpu;

    public Computer(long id, String brand, String model, int ram, boolean discount, double price, String formFactor, String gpu) {
        super(id, brand, model, ram, discount, price);
        this.formFactor = formFactor;
        this.gpu = gpu;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(formFactor, computer.formFactor) && Objects.equals(gpu, computer.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), formFactor, gpu);
    }

    @Override
    public double calcPriceWithRabatt() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("formFactor='").append(formFactor).append('\'');
        sb.append(", gpu='").append(gpu).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
