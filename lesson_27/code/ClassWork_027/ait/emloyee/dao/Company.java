package ClassWork_027.ait.emloyee.dao;
/*      - добавление сотрудника
        - нахождение сотрудника по id
        - обновление cотрудника
        - удаление сотрудника
        - печать списка сотрудников
        - кол-во сотрудников
        - объем ФОТ
        - объем продаж*/

import ClassWork_027.ait.emloyee.model.Employee;

public interface Company {

    //methode

    boolean addEmployee(Employee employee);


    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    Employee updateEmployee(Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary();

    double totalSales();

    Employee[] findEmployeeHoursGreateThan(int hours);

    Employee[] findEmployeeSalaryRange(double min, double max);

}//end of class
