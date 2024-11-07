package ClassWork_041.treeSetObject;

import java.util.Objects;

public class CarTreeSet implements Comparable<CarTreeSet> {
    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;

    public CarTreeSet(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarTreeSet that)) return false;
        return Objects.equals(regNumber, that.regNumber) && Objects.equals(model, that.model) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, model, color);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreeSetCar{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(CarTreeSet other) {
        int res = this.getRegNumber().compareTo(other.getRegNumber());
        return   res != 0 ? res : this.getColor().compareTo(other.getColor());
    }
}
