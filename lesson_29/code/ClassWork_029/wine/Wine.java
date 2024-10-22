package ClassWork_029.wine;

import java.util.Objects;

public class Wine implements Comparable<Wine> {

    private String type;
    private  String titel;
    private int age;
    private double price;

    public Wine(String type, String titel, int age, double price) {
        this.type = type;
        this.titel = titel;
        this.age = age;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        if (!(o instanceof Wine wine)) return false;
        return age == wine.age && Double.compare(price, wine.price) == 0 && Objects.equals(type, wine.type) && Objects.equals(titel, wine.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, titel, age, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wine{");
        sb.append("type='").append(type).append('\'');
        sb.append(", titel='").append(titel).append('\'');
        sb.append(", age=").append(age);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Wine wine) {
        return this.getAge() - wine.getAge();
    }
}//end of class
