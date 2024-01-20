public class MotorBikeTrip implements ICanTakeTrip, IPerHeadFare
{
    private VehicleType vehicleType;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public MotorBikeTrip(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.vehicleType = VehicleType.SEDAN;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public boolean canTakeTrip()
    {
        if(numberOfPassengers <= 1 && distanceKM <= 10 && numberOfPassengers > 0)
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
            int fare = Math . max (25 , distanceKM * 20) / numberOfPassengers ;

            return fare - ( fare % 5) ;
        }

        else return -1;
    }
}