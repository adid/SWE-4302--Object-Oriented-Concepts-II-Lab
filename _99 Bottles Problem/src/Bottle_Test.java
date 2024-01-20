import org.junit.Test;
import org.junit.Assert;

public class Bottle_Test
{
    private Bottles bottles= new Bottles();

    @Test
    public void test_a_verse()
    {
        String expected = "99 bottles of beer on the wall , 99 bottles of beer .\n" +
                " Take one down and pass it around , 98 bottles of beer on the wall .\n";

        Assert.assertEquals(expected,this.bottles.verse(99));
    }

    @Test
    public void test_another_verse()
    {
        String expected = "89 bottles of beer on the wall , 89 bottles of beer .\n" +
                " Take one down and pass it around , 88 bottles of beer on the wall .\n";

        Assert.assertEquals(expected,this.bottles.verse(89));
    }

    @Test
    public void test_zero_verse()
    {
        String expected = "No more bottles of beer on the wall , no more  bottles of beer .\n" +
                "Go to the store and buy some more , 99 bottles beer on the wall .\n";

        Assert.assertEquals(expected,this.bottles.verse(0));
    }

    @Test
    public void test_one_verse()
    {
        String expected = "1 bottle of beer on the wall , 1 bottle of beer .\n" +
                " Take it down and pass it around , no more bottles of beer on the wall .\n";

        Assert.assertEquals(expected,this.bottles.verse(1));
    }

    @Test
    public void test_two_verse()
    {
        String expected = "2 bottles of beer on the wall , 2 bottles of beer .\n" +
                " Take one down and pass it around , 1 bottle of beer on the wall .\n";

        Assert.assertEquals(expected,this.bottles.verse(2));
    }
}
