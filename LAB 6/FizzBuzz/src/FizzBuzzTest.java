import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzTest
{
    FizzBuzz a= new FizzBuzz();

    @Test
    public void isFizzing()
    {
        Assert.assertEquals("Fizz", a.getFizzyBuzz(9));
    }

    @Test
    public void isBuzzing()
    {
        Assert.assertEquals("Buzz", a.getFizzyBuzz(28));
    }

    @Test
    public void isFizzBuzzing()
    {
        Assert.assertEquals("Fizzbuzz", a.getFizzyBuzz(42));
    }

    @Test
    public void isGotcha()
    {
        Assert.assertEquals("Gotcha", a.getFizzyBuzz(37));
    }
}
