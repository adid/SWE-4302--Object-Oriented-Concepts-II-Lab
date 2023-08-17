using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tak_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            User adid = new User(72, "Adid");
            User alvi = new User(74, "Alvee");

            Epson ep = new Epson();
            Canon can = new Canon();

            ep.Setup_Printer("A4", "One Sided");
            can.Setup_Printer("Letter", "Both Sided");

            ep.Change_Color("Color");

            PrintManagement agent= new PrintManagement("Nirjhar");

            agent.Print("Alvee is a Cow",can);
            agent.Print("Bangladesh is Red and Green",ep);

            Console.ReadKey();
        }
    }
}
