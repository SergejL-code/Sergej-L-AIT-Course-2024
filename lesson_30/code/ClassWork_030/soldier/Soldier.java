package ClassWork_030.soldier;

import java.util.Objects;

public class Soldier implements Comparable<Soldier> {

    private String name;
    private int height;
    private double weight;
    private int profile;

    public Soldier(String name, int height, double weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soldier soldier)) return false;
        return height == soldier.height && Double.compare(weight, soldier.weight) == 0 && profile == soldier.profile && Objects.equals(name, soldier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, profile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Soldier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", profile=").append(profile);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Soldier soldier) {
        return Integer.compare(this.getHeight(), soldier.getHeight());
        // return this.getHeight() - soldier.getHeight();
    }
}
