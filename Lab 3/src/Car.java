public class Car extends Vehicle implements IDriveable {

    public Fuel fuel;
    public Car(String name, Fuel fuel) {
        super(name);
        this.fuel = fuel;
    }

    @Override
    public void AccelerateEngine() {
        System.out.println(name + " is accelerating engine");
    }
}
