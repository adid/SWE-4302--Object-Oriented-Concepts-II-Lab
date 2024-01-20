import org.junit.Test;
import org.junit.Assert;


public class VehicleTest
{
    private Trip sedan = new Trip(VehicleType.SEDAN,5,10,3);
    private Trip seven= new Trip(VehicleType.SEVEN_SEATER,15,40,6);
    private Trip bike= new Trip(VehicleType.MOTOR_BIKE,8,20,1);
    private  SedanTrip first= new SedanTrip(10,20,2);

    @Test
    public void SedanCanTakeATrip()
    {
        Assert.assertEquals(true,sedan.canTakeTrip());
    }

    @Test
    public void SedanCanTakeATrip2()
    {
        Assert.assertEquals(true,first.canTakeTrip());
    }

    @Test
    public void SevenSeaterCanTakeATrip()
    {
        Assert.assertEquals(true,seven.canTakeTrip());
    }

    @Test
    public void MotorBikeCanTakeATrip()
    {
        Assert.assertEquals(true,bike.canTakeTrip());
    }

    @Test
    public void SedanCalculateFare()
    {
        Assert.assertEquals(70,sedan.perHeadFare());
    }

    @Test
    public void Seven_SeaterCalculateFare()
    {
        Assert.assertEquals(72,seven.perHeadFare());
    }

    @Test
    public void Motor_BikeCalculateFare()
    {
        Assert.assertEquals(160,bike.perHeadFare());
    }
}
