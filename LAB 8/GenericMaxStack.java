import java.util.Stack;

public class GenericMaxStack <T extends Comparable<T>>
{
    private Stack<T> stack;
    private Stack<T> maxStack;
    private T maxVal;

    public GenericMaxStack()
    {
        stack= new Stack<>();
        maxStack= new Stack<>();
    }

    boolean checkGreater(T a, T b)
    {
        return a.compareTo(b)<0;
    }

    public void Push(T n)
    {
        stack.push(n);

        if(stack.isEmpty())
        {
            maxVal=n;
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
        if(stack.isEmpty()){
            throw new IllegalArgumentException("Stack is Empty");
        }
        stack.pop();
        maxStack.pop();
    }

    public T max()
    {
        return maxStack.peek();
    }
}