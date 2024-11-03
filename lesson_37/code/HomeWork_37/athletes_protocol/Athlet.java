package HomeWork_37.athletes_protocol;

import java.util.Objects;

public class Athlet implements Comparable<Athlet> {
    private String lastName;
    private String firstName;
    private  int regNumber;
    private  String clubName;
    private double result;

    public Athlet(String lastName, String firstName, int regNumber, String clubName, double result) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.regNumber = regNumber;
        this.clubName = clubName;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlet athlet)) return false;
        return regNumber == athlet.regNumber && Objects.equals(clubName, athlet.clubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, clubName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Athlet{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", regNumber=").append(regNumber);
        sb.append(", clubName='").append(clubName).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Athlet o) {
        return Integer.compare(getRegNumber(),o.getRegNumber());
    }
}
