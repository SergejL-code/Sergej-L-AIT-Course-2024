package ClassWork_027.ait_027.emloyee.dao;

import ClassWork_027.ait_027.emloyee.model.Employee;
import ClassWork_027.ait_027.emloyee.model.SalesManager;

import java.util.function.Predicate;

public class CompanyImpl implements Company {

    private Employee[] employees;//element array employees[0]
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        //bad cases
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
        if (!(findEmployee(employee.getId()) == null)) {
            return false;
        }
        //positive case
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {

        //на место жертвы ставим(копируем) последний элемент


        //size--;
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1]; //на место жертвы ставим(копируем) последний элемент
                employees[size - 1] = null;// последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }

        return totalSalary;
    }

    public double averageSalary() {
        if (size == 0) {
            return 0;
        }
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {//проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    //search for employees who have worked more than
    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return findEmployeeByPredicate(employee -> employee.getHours() > hours);
    }

    /*count quantity
       public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].getHours() > hours){
                res[j++] = employees[i];
            }
        }
        return res;

    }*/
    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return findEmployeeByPredicate(employee -> employee.calcSalary() >= min && employee.calcSalary() <= max);
    }
    /*
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max ){
                count++;
            }
        }
        Employee[] res = new Employee[count];// new Array for results
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max){
                res[j++] = employees[i];
            }
        }
        return res;
    }*/

    private Employee[] findEmployeeByPredicate(Predicate<Employee> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i])) { //обьект проходит тест
                count++;
            }
        }
        //читаем массив и перекладываем рез-ты в новый
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(employees[i])) {
                res[j++] = employees[i];
            }
        }
        return res;
    }
}//end of class
