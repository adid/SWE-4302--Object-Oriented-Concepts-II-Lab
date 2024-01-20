public class Bicycle extends Vehicle implements IRidable
{
    public int wheel;
    public Bicycle(String name, int _wheel) {
        super(name);
        this.wheel = _wheel;
    }

    @Override
    public void Ride() {
        System.out.println(name + " is rideable");
    }
}
