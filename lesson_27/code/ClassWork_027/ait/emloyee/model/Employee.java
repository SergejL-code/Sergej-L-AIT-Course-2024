package ClassWork_027.ait.emloyee.model;

import java.util.Objects;

public abstract class Employee {

    //fields
    protected static double minWage = 12.41; //minimum wage that is relevant to all employees.
    protected final int id;
    protected String firstName;
    protected  String secondName;
    protected double hours;

    public static  double getMinWage(){
        return minWage;
    }
    // protects the system against accidental or intentional lowering of the minimum wage below a set level.
    public static void setMinWage(double minWage){
        if(minWage>Employee.minWage){//This check prevents the minimum wage from decreasing. Thus, the minimum wage can only increase, not decrease.
            Employee.minWage=minWage;
        }
    }

    public Employee(int id, String firstName, String secondName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(' ');
        return sb.toString();
    }

    //method for salary
    public abstract double calcSalary();//продекларировыли
    protected double esureSalary(double salary){
        if(salary<hours*minWage){
            System.out.println(" Set min salary ");
            salary = hours*minWage;
        }
        return salary;
    }


}//end of class
