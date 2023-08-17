using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tak_1
{
    public class User
    {
        public int Id { get; set; }
        public string name { get; set; }

        public User(int id, string name)
        {
            Id = id;
            this.name = name;
        }
    }
}
