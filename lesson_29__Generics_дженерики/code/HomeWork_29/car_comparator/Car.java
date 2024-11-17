package HomeWork_29.car_comparator;
/*На примере класса Car с полями модель, цвет, стоимость, год выпуска повторить все то, что делали с классом Wine на занятии. Получить сортированные списки объектов типа Car:

по моделям
по цвету
по стоимости
по году выпуска Реализовать в отдельном пакете car_sorting по аналогии (Car, CarTest)*/
import java.util.Objects;

public class Car implements Comparable<Car> {

    private  String model;
    private String color;
    private double price;
    private int yearOfManufacture;

    public Car(String model, String color, double price, int yearOfManufacture) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(price, car.price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price, yearOfManufacture);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car ");
        sb.append(" model = '").append(model).append('\'');
        sb.append(", color = '").append(color).append('\'');
        sb.append(", price = ").append(price);
        sb.append(", yearOfManufacture = ").append(yearOfManufacture);
        sb.append(' ');
        return sb.toString();
    }

    @Override
    public int compareTo(Car auto) {
        return this.getYearOfManufacture() - auto.getYearOfManufacture() ;
    }
}
