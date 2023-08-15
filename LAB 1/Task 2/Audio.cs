using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    public class Audio
    {
        public string title;

        public Audio(string title)
        {
            this.title = title;
        }
    }
    
    public class Song: Audio
    {
        public string artist;
        public double duration;

        public Song(string title, string artist, double duration): base(title)
        {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }
    }

    public class Podcast:Audio
    {
        public string host;
        public int episode_no;

        public Podcast(string title, string host, int episode_no): base(title)
        {
            this.title = title;
            this.host = host;
            this.episode_no = episode_no;
        }
    }

    public class Audiobook:Audio
    {
        public string narrator;

        public Audiobook(string title, string narrator):base(title)
        {
            this.title = title;
            this.narrator = narrator;
        }
    }
}
