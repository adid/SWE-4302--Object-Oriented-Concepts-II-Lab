using EmployeeManagementApp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagementApp_C_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee me= new Employee();
            me.GenerateReport();

            EmployeeController controller = new EmployeeController();

            Console.WriteLine("Update\n");

            Employee old= new Employee("Alvee", 12000, "Kamla");
            Employee neww = new Employee("Alviii", 12000, "Software Engineer");
            controller.updateEmployee(old, neww);

            Console.WriteLine("\nFind\n");

            controller.findEmployee("Jane Smith");
            controller.findEmployee("Alvee");

            Console.WriteLine("\nDelete\n");

            Employee jane= new Employee("Jane Smith", 6000, 1200, "Manager", new DateTime(2021, 8, 22));
            Employee alvii = new Employee("Alvii", 20000);

            controller.deleteEmployee(jane);
            controller.deleteEmployee(alvii);

            Console.WriteLine("\nShow\n");

            List<Employee> employees= controller.GetAllEmployees();
            foreach (Employee employee in employees)
            {
                Console.WriteLine(employee.Name+" - "+employee.Designation);
            }

            Console.ReadKey();
        }
    }
}
