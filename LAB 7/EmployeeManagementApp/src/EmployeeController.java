import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
        hireEmployee("John Doe", 5000, 1000, "Engineer", new Date());
        hireEmployee("Jane Smith", 6000, 1200, "Manager", new Date(2021 - 1900, 7, 22)); // Months are 0-based in Java
        //hireEmployee("Bob", 30000, "Worker");
    }

    public void hireEmployee(String name, double basicSalary, double bonus, String designation, Date dateOfJoining) {
        Employee employee = new Employee(name, basicSalary, bonus, designation, dateOfJoining);
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
