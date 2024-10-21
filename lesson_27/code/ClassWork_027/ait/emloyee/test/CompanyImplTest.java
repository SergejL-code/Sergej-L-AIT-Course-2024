package ClassWork_027.ait.emloyee.test;

import ClassWork_027.ait.emloyee.dao.Company;
import ClassWork_027.ait.emloyee.dao.CompanyImpl;
import ClassWork_027.ait.emloyee.model.Employee;
import ClassWork_027.ait.emloyee.model.Manager;
import ClassWork_027.ait.emloyee.model.SalesManager;
import ClassWork_027.ait.emloyee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;


    @BeforeEach
    void setUp() {
        // creat object
        company = new CompanyImpl(6);
        //fill array to fill object company
        emp = new Employee[5];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 162, 50000, 0.10);
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 178, 20);

        //TODO: поместить обьекты  emp[] в обьект  с помошью метода AddEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }
    }

    @Test
    void addEmployeeTest() {
        //check size
        assertEquals(4, company.quantity());
        //can#t add null
        assertFalse(company.addEmployee(null));
        //can't add duplicate
        assertFalse(company.addEmployee(emp[1]));
        //can add new one employee
        Employee newEmp = new Worker(07, "N7", "L7", 160, 20);
        assertTrue(company.addEmployee(newEmp));
        //check size
        assertEquals(5, company.quantity());
        //can't add one more
        Employee nextEmp = new Worker(8, "N6", "L6", 160, 20);
        assertFalse(company.addEmployee(nextEmp));
    }

    @Test
    void removeEmployeeTest() {
//can remove existed
        assertEquals(emp[1], company.removeEmployee(2));
        //check size
        assertEquals(3, company.quantity());
        //can't remove absent
        assertNull(company.removeEmployee(10));
    }

    @Test
    void findEmployeeTest() {
        //find existed
        assertEquals(emp[2], company.findEmployee(3));
        //find absent
        assertNull(company.findEmployee(7));
    }

    @Test
    void updateEmployeeTest() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
        // методы типа void не проверяются с помощью assert...
    void printEmployeeTest() {
        company.printEmployee();
    }

    @Test
    void totalSalaryTest() {
        double totalSalary = 29200;//gees
        assertEquals(totalSalary, company.totalSalary());
    }

    @Test
    void totalSalesTest() {
        assertEquals(130000, company.totalSales());
    }

    @Test
    void averageSalaryTest() {
        assertEquals(7300, company.averageSalary());
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
        Employee[] expected = {emp[1], emp[3]};
        Employee[] actual = company.findEmployeeHoursGreaterThan(160);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeeSalaryRangeTest() {
        Employee[] expected = {emp[1], emp[4]};
        Employee[] actual = company.findEmployeeSalaryRange(4000,15000);
        assertArrayEquals(expected, actual);
    }
}//end of class