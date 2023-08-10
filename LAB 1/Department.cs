using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWE_4301_LAB_1
{
    internal class Department
    {
        public string name { get; set; }
        public List<Product> Products = new List<Product>();
        public Department(string _name) 
        {
            name = _name;
        }

        public void AddProduct(Product product)
        {
            if (name == "Electronics")
            {
                product.discount = 10;
                //product.price -= (product.price * 10 / 100);
            }
            if (name == "Clothing")
            {
                product.discount = 15;
                //product.price -= (product.price * 15 / 100);
            }

            else
            {
                //product.price -= (product.price * product.discount / 100);
            }

            Products.Add(product);
        }

        public void DeleteProduct(int _barcode)
        {
            foreach (Product p in Products)
            {
                if (p.barcode == _barcode)
                {
                    Products.Remove(p);
                }
            }
        }

        public void ChangeQuantity(int _barcode, int _quantity)
        {
            foreach (Product p in Products)
            {
                if (p.barcode == _barcode)
                {
                    p.quantity += _quantity;
                }
            }
        }

        public void ShowProduct(int _barcode)
        {
            foreach (Product p in Products)
            {
                if (p.barcode == _barcode)
                {
                    int price = p.price - (p.price * p.discount / 100);
                    Console.WriteLine($"Name: {p.name}  Department: {name}  Barcode: {p.barcode}    Quantity: {p.quantity}  Price:{p.price}  Discount: {p.discount} Discounted Price: {price} \n");
                }
            }
        }

    }
}
