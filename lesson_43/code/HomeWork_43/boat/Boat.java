package HomeWork_43.boat;

import java.util.Objects;

public class Boat {

    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String hullMaterial;
    private double price;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat boat)) return false;
        return year == boat.year && Double.compare(length, boat.length) == 0 && Double.compare(price, boat.price) == 0 && Objects.equals(manufacturer, boat.manufacturer) && Objects.equals(country, boat.country) && Objects.equals(hullMaterial, boat.hullMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, country, year, length, hullMaterial, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("manufacturer='").append(manufacturer).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", year=").append(year);
        sb.append(", length=").append(length);
        sb.append(", hullMaterial='").append(hullMaterial).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
