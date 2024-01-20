public class Main {
    public static void main(String[] args)
    {
        SedanTrip sedan = new SedanTrip(5,10,3);
        SevenSeaterTrip seven= new SevenSeaterTrip(15,40,6);
        MotorBikeTrip bike= new MotorBikeTrip(8,20,1);
        SevenSeaterTrip sevenn= new SevenSeaterTrip(15,40,8);

        System.out.println(sedan.canTakeTrip());
        System.out.println(seven.canTakeTrip());
        System.out.println(bike.canTakeTrip());
        System.out.println(sevenn.canTakeTrip());

        System.out.println(sedan.perHeadFare());
        System.out.println(seven.perHeadFare());
        System.out.println(bike.perHeadFare());
        System.out.println(sevenn.perHeadFare());
    }
}