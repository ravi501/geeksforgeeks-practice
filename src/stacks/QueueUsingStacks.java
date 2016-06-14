package stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStacks
{
    public Stack<Integer> stack1;

    public Stack<Integer> stack2;

    public QueueUsingStacks()
    {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void enqueue( int item )
    {
        stack1.push( item );
    }

    public int dequeue()
    {
        if ( isEmpty() )
        {
            throw new NoSuchElementException( "Stack underflow" );
        }
        else
        {
            moveStack1ToStack2();
        }

        return stack2.pop();
    }

    private void moveStack1ToStack2()
    {
        while ( !stack1.isEmpty() )
            stack2.push( stack1.pop() );

    }

    private boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
