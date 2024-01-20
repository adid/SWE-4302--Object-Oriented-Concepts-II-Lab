public class SedanTrip implements ICanTakeTrip, IPerHeadFare
{
    private VehicleType vehicleType;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public SedanTrip(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.vehicleType = VehicleType.SEDAN;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public boolean canTakeTrip()
    {
        if(numberOfPassengers <= 4 && numberOfPassengers > 0 && distanceKM <= 25)
        {
            return true;
        }
        return false;
    }

    @Override
    public int perHeadFare()
    {
        if(canTakeTrip())
        {
            int fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
            return fare - (fare % 5);
        }

        else return -1;
    }
}