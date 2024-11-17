package HomeWork_38.temperaturInDerStadt.model;

import java.time.LocalDate;
import java.util.Objects;

public class DayTemperature implements Comparable<DayTemperature> {
    private LocalDate date;
    private double temperatur;

    public DayTemperature(LocalDate date, double temperatur) {
        this.date = date;
        this.temperatur = temperatur;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DayTemperature that)) return false;
        return Double.compare(temperatur, that.temperatur) == 0 && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, temperatur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayTemperature{");
        sb.append("date=").append(date);
        sb.append(", temperatur=").append(temperatur);
        sb.append('}');
        return sb.toString();


    }

    @Override
    public int compareTo(DayTemperature other) {
        return Double.compare(this.getTemperatur(),other.getTemperatur());
    }
}
