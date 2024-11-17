package HomeWork_37.Universe_1;

import java.util.Objects;

public class Planet_1 implements Comparable<Planet_1> {
    private String name;
    private double weight;
    private double distanceToSun;
    private int numberOfSatellites;

    public Planet_1(String name, double weight,double distanceToSun, int numberOfSatellites) {
        this.name = name;
        this.weight = weight;
        this.distanceToSun = distanceToSun;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet_1 planet1)) return false;
        return Double.compare(weight, planet1.weight) == 0 && Double.compare(distanceToSun, planet1.distanceToSun) == 0 && numberOfSatellites == planet1.numberOfSatellites && Objects.equals(name, planet1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, distanceToSun, numberOfSatellites);
    }

    @Override
    public String toString() {
        return String.format("%s: Weight=%.2e kg, Distance to Sun=%.2f km, Satellites=%d",
                name, weight, distanceToSun, numberOfSatellites);
    }

//default compare
    @Override
    public int compareTo(Planet_1 other) {
        return Double.compare(getDistanceToSun(),other.getDistanceToSun());
    }
}
