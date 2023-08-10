using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWE_4301_LAB_1
{
    internal class Product
    {
        public int barcode { get; set; }
        public string name { get; set; }
        public int price { get; set; }

        public int quantity { get; set; }

        public int discount { get; set; }


        public Product(int _barcode, string _name, int _price, int _quantity, int _discount)
        {
            barcode = _barcode;
            name = _name;
            price = _price;
            quantity = _quantity;
            discount = _discount;
        }


    }
}
