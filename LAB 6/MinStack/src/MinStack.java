import java.util.Stack;

public class MinStack
{
    Stack<Integer> stack= new Stack<Integer>();
    Stack<Integer> minstack= new Stack<Integer>();

    public void push(int i)
    {
        stack.push(i);

        if(stack.size()==1)
        {
            minstack.push(i);
            return;
        }

        if(minstack.peek()>=i)
        {
            minstack.push(i);
        }
    }
    public void pop()
    {
        if(stack.peek()==minstack.peek())
        {
            minstack.pop();
        }

        stack.pop();
    }
    public int calculateMin()
    {
        return minstack.peek();
    }
}
