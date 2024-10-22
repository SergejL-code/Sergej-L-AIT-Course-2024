package HomeWork_28.ait_028.emloyee.model;

public class Manager extends Employee {
    private double baseSalary;
    private int gradeManager;

    public Manager(int id, String firstName, String secondName, double hours, double baseSalary, int grade) {
        super(id, firstName, secondName, hours);
        this.baseSalary = baseSalary;
        this.gradeManager = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return gradeManager;
    }

    public void setGrade(int grade) {
        this.gradeManager = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + gradeManager*hours;
        return esureSalary(salary);//check min value of salary
    }

}//end of class
