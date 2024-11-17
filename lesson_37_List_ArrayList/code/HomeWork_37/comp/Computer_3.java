package HomeWork_37.comp;

import java.util.Objects;

public class Computer_3 implements Comparable<Computer_3> {
    private long id;
    private String brand;
    private String model;
    private int ram;
    private int ssd;

    public Computer_3(long id, String brand, String model, int ram, int ssd) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer_3 computer3)) return false;
        return id == computer3.id && ram == computer3.ram && ssd == computer3.ssd && Objects.equals(brand, computer3.brand) && Objects.equals(model, computer3.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, ram, ssd);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer_3{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Computer_3 other) {
        return  this.getBrand().compareTo(other.getBrand());
    }
}
