import java.util.Stack;

public class MinMaxStack <T extends Comparable<T>>
{
    private Stack<T> stack;
    private Stack<T> maxStack;
    private Stack<T> minStack;
    private T maxVal;
    private T minVal;

    public MinMaxStack()
    {
        stack= new Stack<>();
        maxStack= new Stack<>();
        minStack= new Stack<>();
    }

    boolean checkGreater(T a, T b)
    {
        return a.compareTo(b)<0;
    }
    boolean checkLower(T a, T b)
    {
        return a.compareTo(b)>0;
    }

    public void Push(T n)
    {
        stack.push(n);

        if(stack.isEmpty())
        {
            maxVal=n;
            minVal=n;
        }

        else
        {
            if(checkGreater(maxVal, n))
            {
                maxVal=n;
            }
            if(checkLower(minVal, n))
            {
                minVal=n;
            }
        }
        maxStack.push(maxVal);
        minStack.push(minVal);
    }

    public void Pop()
    {
        if(stack.isEmpty()){
            throw new IllegalArgumentException("Stack is Empty");
        }
        stack.pop();
        maxStack.pop();
        minStack.pop();
    }

    public T aggregate(String minmax)
    {
        if(minmax.equals("max"))
        {
            return maxStack.peek();
        }
        else if(minmax.equals("min"))
        {
            return minStack.peek();
        }
        else
            throw  new IllegalArgumentException("Invalid");
    }
}