using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    public class Program
    {
        static void Main(string[] args)
        {
            User Adid = new User("Adid");

            Playlist Playlist_1 = new Playlist("Playlist_1");
            Playlist playlist_2 = new Playlist("playlist_2");

            Adid.Create_Playlist(Playlist_1);
            Adid.Create_Playlist(playlist_2);

            Song Night_Changes = new Song("Night Changes", "One_direction", 3.50);
            Song Bishonno_Shundor = new Song("Bishonno Shundor", "Popeye", 4.20);
            Song Aadat = new Song("Aadat", "Atif Aslam", 3.57);

            Podcast Trinominal = new Podcast("Trinominal", "Khalid Farhan", 5);
            Podcast Pewdipie = new Podcast("Pewdipie", "Pewd", 3);

            Audiobook Sunday_suspense = new Audiobook("Sunday Suspense", "Feluda");

            Adid.Play_Audio(Aadat);
            Adid.Pause_Audio(Aadat);
            Adid.Stop_Audio(Aadat);

            Console.WriteLine("\n");

            Adid.Add_Audio_to_Playlist(Night_Changes, Playlist_1);
            Adid.Add_Audio_to_Playlist(Aadat, Playlist_1);
            Adid.Add_Audio_to_Playlist(Trinominal, Playlist_1);
            Adid.Add_Audio_to_Playlist(Sunday_suspense, Playlist_1);

            Console.WriteLine("\n");

            Adid.Add_Audio_to_Playlist(Bishonno_Shundor, playlist_2);
            Adid.Add_Audio_to_Playlist(Pewdipie, playlist_2);

            Console.WriteLine("\n");

            Adid.Play_AlltheAudio_ofa_Playlist(Playlist_1);

            Console.WriteLine("\n");

            Adid.Play_AlltheAudio_ofa_Playlist(playlist_2);

            Console.ReadKey();
        }
    }
}
