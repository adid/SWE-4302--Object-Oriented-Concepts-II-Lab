import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public List<Employee> employees;

    public Tasks(List<Employee> employees) {
        this.employees = employees;
    }

    public void filterByAge() {
        employees.stream().filter(e -> e.getAge() > 30)
                .forEach(e -> System.out.println(e.getFirstName()));
    }

    public void groupEmployeeByPostalCode() {
        employees.stream().collect(Collectors.groupingBy(Employee::getPostalCode))
                .forEach((pc, empList) -> {
                    System.out.print(pc + ": ");
                    empList.forEach(emp -> System.out.print(emp.getFirstName() + " "));
                    System.out.print("\n");
                });
    }


    public double averageRemuneration(){
        double average = employees.stream().mapToDouble(Employee::getRemuneration).average().getAsDouble();
        return average;
    }

    public String highestRemuneration(){
        String maxemp = employees.stream().max(Comparator.comparingDouble(e -> e.getRemuneration())).get().getFirstName();
        return maxemp;
    }

    public boolean checkManager(){
        return employees.stream().anyMatch(e -> e.getDesignation().equals("Manager"));
    }

    public void sortAsc(){
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(e -> System.out.println("Name: " + e.getFirstName() + " " + e.getLastName() + "; Age: "+ e.getAge()));
    }

    public void sortDesc(){
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .forEach(e -> System.out.println("Name: " + e.getFirstName() + " " + e.getLastName() + "; Age: "+ e.getAge()));
    }

    public String youngestEmp(){
        return employees.stream().min(Comparator.comparingInt(e -> e.getAge())).get().getFirstName();
    }

    public int uptownEmp() {
        return (int) employees.stream().filter(e -> e.getDistrict().equals("Uptown")).count();
    }

    public void distinctPostalCode() {
        employees.stream().mapToInt(e -> e.getPostalCode()).distinct()
                .forEach(e -> System.out.println(e));
    }

    public double totalRemuneration() {
        return employees.stream().reduce(0.0, (subtotal, employee) -> subtotal + employee.getRemuneration(), Double::sum);
    }

    public boolean checkAdult() {
        return employees.stream().allMatch(e -> e.getAge() > 18);
    }

    public void skipEmp() {
        employees.stream().skip(3)
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));
    }

    public double averageAgeinDowntown() {
        return employees.stream().filter(e -> e.getDistrict().equals("Downtown")).mapToInt(e -> e.getAge()).average().getAsDouble();
    }

    public void top3ByRemuneration() {
        employees.stream().sorted(Comparator.comparingDouble(Employee::getRemuneration).reversed()).limit(3)
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName() + " "  + e.getRemuneration()));
    }
}
