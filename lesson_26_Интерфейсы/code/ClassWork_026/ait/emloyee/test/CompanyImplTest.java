package ClassWork_026.ait.emloyee.test;

import ClassWork_026.ait.emloyee.dao.Company;
import ClassWork_026.ait.emloyee.dao.CompanyImpl;
import ClassWork_026.ait.emloyee.model.Employee;
import ClassWork_026.ait.emloyee.model.Manager;
import ClassWork_026.ait.emloyee.model.SalesManager;
import ClassWork_026.ait.emloyee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyImplTest {

   Company company;
   Employee[] emp;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        emp = new Employee[4];
        emp[0]=new  Manager(01,"N1","L1",160,5000,25);
        emp[1]=new SalesManager(02,"N2","L2",160,50000,0.10);
        emp[2]=new SalesManager(03,"N3","L3",160,80000,0.15);
        emp[3]=new Worker(04,"N4","L4",160,20 );

    }

    @Test
    void addEmployee() {
      //  company.addEmployee()
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void findEmployeeHoursGreateThan() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}