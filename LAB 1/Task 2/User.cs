using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    public class User
    {
        public string Name { get; set; }
        public List<Playlist> playlists = new List<Playlist>();

        public User(string name)
        {
            Name = name;
        }

        public void Play_Audio(Audio a)
        {
            Console.WriteLine(a.title + " Playing");
        }

        public void Pause_Audio(Audio a)
        {
            Console.WriteLine(a.title + " Paused");
        }

        public void Stop_Audio(Audio a)
        {
            Console.WriteLine(a.title + " Stopped");
        }        

        public void Create_Playlist(Playlist p)
        {
            playlists.Add(p);
            Console.WriteLine(p.name+ " Added as a playlist");
        }

        public void Add_Audio_to_Playlist(Audio a, Playlist p)
        {
            foreach(Playlist per in playlists)
            {
                if (per == p)
                {
                    p.audios.Add(a);
                    Console.WriteLine(a.title + " Added to the playlist " + p.name);
                    return;
                }
            }
            
        }

        public void Play_AlltheAudio_ofa_Playlist(Playlist p)
        {
            foreach (Audio a in p.audios)
            {
                Console.WriteLine(a.title);
            }
        }
    }

}