package ClassWork_036.city_bus;
/* создать список городских маршрутов на основе автобусов из городского автопарка;
- отсортировать автобусы в порядке убывания их вместимости;
- подсчитать общую вместимость автобусов из автопарка.*/
import java.util.Objects;

public class Bus implements Comparable<Bus>{
    private String model;
    private String regNumber;
    private String route;
    private int busCapacity;

    public Bus(String model, String regNumber, String route, int busCapacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("model='").append(model).append('\'');
        sb.append(", regNumber='").append(regNumber).append('\'');
        sb.append(", route='").append(route).append('\'');
        sb.append(", busCapacity=").append(busCapacity);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Bus o) {
        return -Integer.compare(getBusCapacity(),o.getBusCapacity());
    }


}//end of class
