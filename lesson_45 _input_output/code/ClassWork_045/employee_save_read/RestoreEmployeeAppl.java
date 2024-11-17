package ClassWork_045.employee_save_read;
/*имеется файл м данными объектов Java
 необходимо его обратно считать для использования в программе*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

public class RestoreEmployeeAppl {
    static Set<Employee> employeeSet = new HashSet<>();

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"))) {

            employeeSet =(Set<Employee>) ois.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        double totalSalary = employeeSet.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary: " + totalSalary);
    }
}
