package HomeWork_30.transport;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
    private String brand;
    private int yearOfManufacture;
    private double engineVolume;

    public Vehicle(String brand, int yearOfManufacture, double engineVolume) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.engineVolume = engineVolume;
    }
    //Methode of print
    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfManufacture == vehicle.yearOfManufacture && Double.compare(engineVolume, vehicle.engineVolume) == 0 && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, yearOfManufacture, engineVolume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle ");
        sb.append(" brand =  ").append(brand).append(' ');
        sb.append(" | yearOfManufacture = ").append(yearOfManufacture);
        sb.append(" | engineVolume=").append(engineVolume);
        sb.append(' ');
        return sb.toString();
    }


    @Override
    public int compareTo(Vehicle pkw) {
        return Integer.compare(this.getYearOfManufacture(),pkw.getYearOfManufacture());
    }
}//en of class
