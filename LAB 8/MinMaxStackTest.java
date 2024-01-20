import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxStackTest
{
    @Test
    void minMaxTestCase1()
    {
        int higher=5;
        MinMaxStack<Integer> ms=new MinMaxStack<Integer>();
        ms.Push(3);
        ms.Push(2);
        ms.Push(5);
        assertEquals(higher, ms.aggregate("max"));
    }

    @Test
    void minMaxTestCase2()
    {
        int lower=2;
        MinMaxStack<Integer> ms=new MinMaxStack<Integer>();
        ms.Push(3);
        ms.Push(2);
        ms.Push(5);
        assertEquals(lower, ms.aggregate("min"));
    }

    @Test
    void minMaxTestCase3()
    {
        int max=2;
        int min=1;

        MinMaxStack<Integer> ms=new MinMaxStack<Integer>();
        ms.Push(2);
        ms.Push(1);
        ms.Push(2);
        ms.Push(5);
        ms.Pop();
        ms.Pop();
        assertEquals(max,  ms.aggregate("max"));
        assertEquals(min, ms.aggregate("min"));
    }

    @Test
    void minMaxTestCaseString()
    {
        String max="Try harder";
        String min="Nothing to understand";

        MinMaxStack<String> ms=new MinMaxStack<String>();

        ms.Push("OOC is bad");
        ms.Push("Nothing to understand");
        ms.Push("Try harder");

        assertEquals(max,  ms.aggregate("max"));
        assertEquals(min, ms.aggregate("min"));

        ms.Pop();

        max="OOC is bad";
        assertEquals(max,  ms.aggregate("max"));
        assertEquals(min, ms.aggregate("min"));
    }

    @Test
    void minMaxTestCase4()
    {
        double max=100;
        double min=23.54;

        MinMaxStack<Double> ms=new MinMaxStack<Double>();
        ms.Push(49.75);
        ms.Push(23.54);
        ms.Push(100.00);

        assertEquals(max,  ms.aggregate("max"));
        assertEquals(min, ms.aggregate("min"));
    }

}
