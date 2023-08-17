using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tak_1
{
    public interface Print
    {
        void Print(string text);
    }

    public class Epson: Print
    {
        public string color;
        public string side;
        public string page_type;

        public Epson()
        {
            this.color = "Black and White";
        }

        public void Print(string text)
        {
            Console.WriteLine($"Printing {color} pages {side} on {page_type} paper for {text}");
        }

        public void Setup_Printer(string _page_type, string _side)
        {
            this.side = _side;
            this.page_type = _page_type;
        }

        public void Change_Color(string _color)
        {
            this.color = _color;
        }
    }

    public class Canon : Print
    {
        public string color;
        public string side;
        public string page_type;

        public Canon()
        {
            this.color = "Color";
        }

        public void Print(string text)
        {
            Console.WriteLine($"Printing {color} pages {side} on {page_type} paper for {text}");
        }

        public void Setup_Printer(string _page_type, string _side)
        {
            this.side = _side;
            this.page_type = _page_type;
        }

        public void Change_Color(string _color)
        {
            this.color = _color;
        }
    }

    public class PrintManagement
    {
        public string name;

        public PrintManagement(string name)
        {
            this.name = name;
        }

        public void Print(string text, Print print)
        {
            print.Print(text);
        }
    }
}
