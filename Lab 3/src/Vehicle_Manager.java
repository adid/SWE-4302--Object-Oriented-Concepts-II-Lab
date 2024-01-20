public class Vehicle_Manager
{
    public String name;

    public Vehicle_Manager(String name)
    {
        this.name= name;
    }

    public void Start_Vehicle(Vehicle v)
    {
        v.Start();
    }

    public void Stop_Vehicle(Vehicle v)
    {
        v.Start();
    }

    public void Accelerate_Engine(Vehicle v)
    {
        if(v instanceof IDriveable)
        {
            ((IDriveable) v).AccelerateEngine();
        }
    }

    public void Ride_Vehicle(Vehicle v)
    {
        if(v instanceof IRidable)
        {
            ((IRidable) v).Ride();
        }
    }
}
