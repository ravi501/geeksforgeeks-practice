package stacks;

import java.util.Stack;

public class ReverseStackRecursion
{
    Stack<Integer> stack;
    
    public ReverseStackRecursion()
    {
        stack = new Stack<Integer>();
    }
    
    public Stack<Integer> reverse(Stack<Integer> stack1)
    {
        
        if(stack1.size() != 0)
        {
            int popValue = getLast(stack1);
            reverse( stack1 );
            stack1.push( popValue );
        }
        
        return stack1;
    }

    private int getLast( Stack<Integer> stack1 )
    {
        int lastElement = stack1.pop();
        if(stack1.size() == 0)
        {
            return lastElement;
        }
        else
        {
            int lastElem = getLast( stack1 );
            stack1.push( lastElement );
            return lastElem;
        }
    }
    

}
