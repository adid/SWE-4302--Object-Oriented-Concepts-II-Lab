public class TripRefactor implements ICanTakeTrip, IPerHeadFare
{
    private VehicleType vehicleType;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public TripRefactor(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.vehicleType = vehicleType;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public boolean canTakeTrip() {
        return false;
    }

    @Override
    public int perHeadFare() {
        return 0;
    }
}
