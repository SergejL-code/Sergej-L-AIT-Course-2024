package HomeWork_44.travel_agency.model;

import java.util.List;
import java.util.Objects;

public class Tourist implements Comparable<Tourist>{
    private String name;
    private List<String> country;

    public Tourist(String name, List<String> country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tourist tourist)) return false;
        return Objects.equals(name, tourist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tourist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Tourist o) {
        return 0;
    }
}
