public class Vehicle
{
    public String name;

    public Vehicle(String _name)
    {
        this.name= _name;
    }

        public void Start()
        {
            System.out.println(name+" started");
        }

    public void Stop()
    {
        System.out.println(name+" stopped");
    }
}


