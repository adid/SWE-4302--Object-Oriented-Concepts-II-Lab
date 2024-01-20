import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaxStackTest {

    @Test
    void maxTestCase1()
    {
        int expected=5;
        GenericMaxStack<Integer> ms=new GenericMaxStack<Integer>();
        ms.Push(3);
        ms.Push(5);
        ms.Push(2);
        assertEquals(expected, ms.max());
    }

    @Test
    void maxTestCase2()
    {
        int expected=2;
        GenericMaxStack<Integer> ms=new GenericMaxStack<Integer>();
        ms.Push(2);
        ms.Push(1);
        ms.Push(2);
        ms.Push(5);
        ms.Pop();
        assertEquals(expected, ms.max());
        ms.Pop();
        assertEquals(expected, ms.max());
    }

    @Test
    void maxTestCase3()
    {
        double expected=100;
        GenericMaxStack<Double> ms=new GenericMaxStack<Double>();
        ms.Push(49.75);
        ms.Push(23.54);
        ms.Push(100.00);
        assertEquals(expected, ms.max());
        ms.Pop();
        expected= 49.75;
        assertEquals(expected, ms.max());
    }

    @Test
    void maxTestCaseString()
    {
        String expected="Try harder";
        GenericMaxStack<String> ms=new GenericMaxStack<String>();
        ms.Push("OOC is bad");
        ms.Push("Nothing to understand");
        ms.Push("Try harder");

        assertEquals(expected, ms.max());

        ms.Pop();
        expected="OOC is bad";
        assertEquals(expected, ms.max());
    }

}
