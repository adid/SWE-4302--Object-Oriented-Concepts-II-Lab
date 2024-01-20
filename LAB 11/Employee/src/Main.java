import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static List<Employee> employees;

    public static void main(String[] args){

        // Task 1
        System.out.println("Employee Information: ");
        String path = "D:\\Study\\SPL\\Data\\employee_data.csv";

        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            employees= lines.skip(1)  // Skipping column name
                 .map(line -> {
                     String[] parts = line.split(",");
                     return new Employee(parts[0],parts[1],Integer.parseInt(parts[2]),parts[3],parts[4],Integer.parseInt(parts[5]),parts[6],Double.parseDouble(parts[7]));
                 })
                    .collect(Collectors.toList());
        }
        catch (Exception e){
            System.out.println("Exception found: " + e);
        }

        System.out.println("Total employees: " + employees.size());
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPostalCode() + " " + employee.getStreet() + " " + employee.getDistrict() + " " + employee.getAge() + " " + employee.getDesignation() + " " + employee.getRemuneration());
        }

        Tasks tasks= new Tasks(employees);
        System.out.print("\n");

        // Task 2
        System.out.println("Employee First Name aged over 30: ");
        tasks.filterByAge();
        System.out.print("\n");

        // Task 3
        System.out.println("Employees for Postal Code: ");
        tasks.groupEmployeeByPostalCode();
        System.out.print("\n");

        // Task 4
        System.out.print("Average Remuneration: ");
        System.out.println(tasks.averageRemuneration());
        System.out.print("\n");

        // Task 5
        System.out.print("Employee with Highest Remuneration: ");
        System.out.println(tasks.highestRemuneration());
        System.out.print("\n");

        // Task 6
        System.out.print("Manager exists: ");
        System.out.println(tasks.checkManager());
        System.out.print("\n");

        // Task 7
        System.out.println("Sorting Ascending of Age: ");
        tasks.sortAsc();
        System.out.print("\n");
        System.out.println("Sorting Descending of Age: ");
        tasks.sortDesc();
        System.out.print("\n");

        // Task 8
        System.out.print("Youngest Employee: ");
        System.out.println(tasks.youngestEmp());
        System.out.print("\n");

        // Task 9
        System.out.print("Number of Employees from Uptown District: ");
        System.out.println(tasks.uptownEmp());
        System.out.print("\n");

        // Task 10
        System.out.println("Distinct Postal Codes: ");
        tasks.distinctPostalCode();
        System.out.print("\n");

        // Task 11
        System.out.print("Total Cost of Remuneration: ");
        System.out.println(tasks.totalRemuneration());
        System.out.print("\n");

        // Task 12
        System.out.print("All Employees are Adult: ");
        System.out.println(tasks.checkAdult());
        System.out.print("\n");

        // Task 13
        System.out.println("Skip 3 Employees: ");
        tasks.skipEmp();
        System.out.print("\n");

        // Task 14
        System.out.print("Average Age in Downtown District: ");
        System.out.println(tasks.averageAgeinDowntown());
        System.out.print("\n");

        // Task 15
        System.out.println("Top 3 Employees with highest Remuneration: ");
        tasks.top3ByRemuneration();
        System.out.print("\n");

    }


}