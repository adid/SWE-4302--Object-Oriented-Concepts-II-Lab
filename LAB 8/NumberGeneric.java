import java.util.Stack;

public class NumberGeneric <T>
{
    private Stack<Number> stack;

    public NumberGeneric()
    {
        stack= new Stack<>();
    }

    boolean checkGreater(T a, T b)
    {
        return a.compareTo(b)<0;
    }

    public void Push(T n)
    {
        stack.push(n);

        if(isEmpty)
        {
            maxVal=n;
            isEmpty=false;
        }

        else
        {
            if(checkGreater(maxVal, n))
            {
                maxVal=n;
            }
        }
        maxStack.push(maxVal);
    }

    public void Pop()
    {
        stack.pop();
        maxStack.pop();
    }

    public T max()
    {
        return maxStack.peek();
    }
}
