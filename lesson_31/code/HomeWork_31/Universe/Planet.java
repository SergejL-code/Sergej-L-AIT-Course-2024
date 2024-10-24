package HomeWork_31.Universe;

import java.util.Objects;

public class Planet implements Comparable<Planet> {
    private String name;                  //name of Planet
    private double weight;                // kg
    private int distanceFromEarth;        // million km


    public Planet(String name, double weight, int distanceFromEarth) {
        this.name = name;
        this.weight = weight;
        this.distanceFromEarth = distanceFromEarth;
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

    public int getDistance() {
        return distanceFromEarth;
    }

    public void setDistance(int distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return Double.compare(weight, planet.weight) == 0 && distanceFromEarth == planet.distanceFromEarth && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, distanceFromEarth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet ");
        sb.append("name - ").append(name).append(' ');
        sb.append(", weight = ").append(weight);
        sb.append(", distance = ").append(distanceFromEarth);
        sb.append(' ');
        return sb.toString( );
    }


    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.distanceFromEarth, o.distanceFromEarth);
    }

    public  static void printArray(Object[] array, String titelOfReport) {
        System.out.println("==============================" + titelOfReport + "=============================");
        for (Object planet : array) {
            System.out.println(planet);
        }
    }
}//end of class
