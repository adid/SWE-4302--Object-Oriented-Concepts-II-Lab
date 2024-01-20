import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private double basicSalary;
    private double bonus;
    private String designation;
    private Date dateOfJoining;
    private double houseAllowance;
    private final double transportAllowance = 5000;
    private final double costOfLiving = 1000;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double basicSalary, String designation) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.houseAllowance = basicSalary * 0.4;
        this.designation = designation;
        this.dateOfJoining = new Date();
    }

    public Employee(String name, double basicSalary, double bonus, String designation, Date dateOfJoining) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return basicSalary + houseAllowance + transportAllowance + costOfLiving + bonus;
    }

    public double calculateSalary() {
        double houseAllowance = 0.4 * basicSalary;
        double transportAllowance = 5000;
        double costOfLiving = 800;
        return basicSalary + houseAllowance + transportAllowance + costOfLiving + bonus;
    }

    public void saveToDatabase() {
        // Implement the database save logic here
    }

    public void generateReport() {
        EmployeeController employeeController = new EmployeeController();
        System.out.println(employeeController.getAllEmployees().size());
        String outputPath = "D:\\Study\\Git\\Java_Resource\\EmployeeReport.xml";
        System.out.println(outputPath);
        generateEmployeeXMLReport(employeeController.getAllEmployees(), outputPath);
    }

    public void generateEmployeeXMLReport(List<Employee> employees, String outputPath) {
        try {
            // Implement XML report generation logic here
            System.out.println("Employee XML report generated successfully.");
        } catch (Exception ex) {
            System.out.println("Error generating the employee XML report: " + ex.getMessage());
        }
    }
}

