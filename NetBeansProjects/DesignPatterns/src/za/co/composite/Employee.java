package za.co.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmanganyi
 */
public class Employee {

    private final String name;
    private final String department;
    private final double salary;
    private final List<Employee> employees;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary + " ]");
    }
}
