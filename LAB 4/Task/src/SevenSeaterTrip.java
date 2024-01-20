public class SevenSeaterTrip implements ICanTakeTrip, IPerHeadFare
{
    private VehicleType vehicleType;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public SevenSeaterTrip(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.vehicleType = VehicleType.SEDAN;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public boolean canTakeTrip()
    {
        if(numberOfPassengers <= 7 && distanceKM >= 10 && numberOfPassengers > 0)
        {
            return true;
        }
        return false;
    }

    @Override
    public int perHeadFare()
    {
        int fare;

        if(canTakeTrip())
        {
            if (distanceKM < 10) fare = 300 / numberOfPassengers;
            else fare = distanceKM * 30 / numberOfPassengers;

            return fare - ( fare % 5) ;
        }

        else return -1;

    }
}