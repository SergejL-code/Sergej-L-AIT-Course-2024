package HomeWork_44.post.model;

import java.util.Objects;

public class Parcel {


    private double weight;//вес посылки

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weight, parcel.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parcel{");
        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
