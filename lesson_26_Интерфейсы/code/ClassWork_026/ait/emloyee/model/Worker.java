package ClassWork_026.ait.emloyee.model;

public class Worker extends Employee{
    private int gradeWorker;

    public Worker(int id, String firstName, String secondName, double hours, int gradeWorker) {
        super(id, firstName, secondName, hours);
        this.gradeWorker = gradeWorker;
    }

    public int getGradeWorker() {
        return gradeWorker;
    }

    public void setGradeWorker(int gradeWorker) {
        this.gradeWorker = gradeWorker;
    }

    @Override
    public double calcSalary() {
        double salaryWorker = gradeWorker*hours;
        return esureSalary(salaryWorker);
    }


}//end of class
