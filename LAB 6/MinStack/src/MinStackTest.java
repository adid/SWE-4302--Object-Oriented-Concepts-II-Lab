import org.junit.Test;
import org.junit.Assert;

public class MinStackTest
{
    MinStack stack= new MinStack();

    @Test
    public void letpush()
    {
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);

        Assert.assertEquals(1, stack.calculateMin());
    }
    @Test
    public void letpop()
    {
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop();

        Assert.assertEquals(2, stack.calculateMin());
    }
    @Test
    public void letpush2()
    {
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop();
        stack.push(12);
        stack.push(3);
        stack.push(4);

        Assert.assertEquals(2, stack.calculateMin());
    }
    @Test
    public void letpush4()
    {
        stack.push(12);
        stack.push(3);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(5);

        Assert.assertEquals(3, stack.calculateMin());
    }
}
