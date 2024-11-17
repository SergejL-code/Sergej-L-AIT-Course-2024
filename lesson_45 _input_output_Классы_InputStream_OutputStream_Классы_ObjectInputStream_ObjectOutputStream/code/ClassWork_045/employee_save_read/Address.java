package ClassWork_045.employee_save_read;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private String city;
    private String street;
    private int building;
    private int aprt;//number der Wohnung
    private int postCode;

    public Address(String city, String street, int building, int aprt, int postCode) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.aprt = aprt;
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getAprt() {
        return aprt;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void setAprt(int aprt) {
        this.aprt = aprt;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return building == address.building && aprt == address.aprt && postCode == address.postCode && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, building, aprt, postCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", building=").append(building);
        sb.append(", aprt=").append(aprt);
        sb.append(", postCode=").append(postCode);
        sb.append('}');
        return sb.toString();
    }

}
