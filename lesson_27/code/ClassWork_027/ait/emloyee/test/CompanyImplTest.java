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
        company = new CompanyImpl(5);
        //fill array to fill object company
        emp = new Employee[4];
        emp[0]=new Manager(01,"N1","L1",160,5000,25);
        emp[1]=new SalesManager(02,"N2","L2",160,50000,0.10);
        emp[2]=new SalesManager(03,"N3","L3",160,80000,0.15);
        emp[3]=new Worker(04,"N4","L4",160,20 );

     //TODO: поместить обьекты  emp[] в обьект  с помошью метода AddEmployee
     for (int i = 0; i < 4; i++) {
      company.addEmployee(emp[i]);
     }
    }

    @Test
    void addEmployeeTest() {
     //check size
     assertEquals(4,company.quantity());
     //can#t add null
     assertFalse(company.addEmployee(null));
     //can't add duplicate
     assertFalse(company.addEmployee(emp[1]));
     //can add new one employee
     Employee newEmp = new Worker(07,"N7","L7",160,20 );
     assertTrue(company.addEmployee(newEmp));
     //check size
     assertEquals(5,company.quantity());
     //can't add one more
     Employee nextEmp = new Worker(8,"N6","L6",160,20 );
     assertFalse(company.addEmployee(nextEmp));
    }

    @Test
    void removeEmployeeTest() {
//can remove existed
     assertEquals(emp[1],company.removeEmployee(2));
     //check size
     assertEquals(3,company.quantity());
     //can't remove absent
     assertNull(company.removeEmployee(10));
    }

    @Test
    void findEmployeeTest() {
     //find existed
     assertEquals(emp[2],company.findEmployee(3));
     //find absent
     assertNull(company.findEmployee(7));
    }

    @Test
    void updateEmployeeTest() {
    }

    @Test
    void quantityTest() {
     assertEquals(4,company.quantity());
    }

    @Test
     // методы типа void не проверяются с помощью assert...
    void printEmployeeTest() {
     company.printEmployee();
    }

    @Test
    void totalSalaryTest() {
    }

    @Test
    void totalSalesTest() {
    }

    @Test
    void findEmployeeHoursGreateThanTest() {
    }

    @Test
    void findEmployeeSalaryRangeTest() {
    }
}//end of class