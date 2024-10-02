package ClassWork_016.Employee.model;

//создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//- создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.
public class Employee {

    //great field of class
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean gender;
    //private Car car;

    public Employee(int id, String firstName, String lastName, double salary, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public String displayEmployee() {
        return String.format("id: %d, name: %s, lastname; %s, salary: %.2f, gender: %s", id, firstName, lastName, salary, gender);
    }

}
