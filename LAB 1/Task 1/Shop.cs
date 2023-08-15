using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWE_4301_LAB_1
{
    internal class Shop
    {
        
        public List<Department> Departments = new List<Department>();

        public void AddDepartment(Department department)
        {
            Departments.Add(department);
        }
        
    }
}
