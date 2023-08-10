using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;

namespace SWE_4301_LAB_1
{
    internal static class Program
    {

        static void Main(string[] args)
        {
            Shop shop = new Shop();

            Department elec = new Department("Electronics");
            Department groc = new Department("Groceries");
            Department cloth = new Department("Clothing");

            shop.AddDepartment(elec);
            shop.AddDepartment(groc);
            shop.AddDepartment(cloth);

            Product phone = new Product(101, "Mobile Phone", 5000, 10, 12);
            Product Pb = new Product(102, "Power Bank", 2000, 20, 30);

            Product apple = new Product(201, "Eggs", 300, 500, 5);

            Product shirt = new Product(301, "Shirt", 2000, 20, 22);

            elec.AddProduct(phone);
            elec.AddProduct(Pb);
            groc.AddProduct(apple);
            cloth.AddProduct(shirt);

            elec.ChangeQuantity(101, 5);

            elec.ShowProduct(101);

            elec.ChangeQuantity(102, -10);

            elec.ShowProduct(102);

            groc.ShowProduct(201);

            cloth.ShowProduct(301);
        }
    }
}

