using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    public class Playlist
    {
        public string name;
        public List<Audio> audios = new List<Audio>();

        public Playlist(string name)
        {
            this.name = name;
        }
    }


}
