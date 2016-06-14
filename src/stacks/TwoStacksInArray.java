package stacks;

/**
 * Implement two stacks in an array
 * 
 * Create a data structure twoStacks that represents two stacks. Implementation of twoStacks should use only 
 * one array, i.e., both stacks should use the same array for storing elements. Following functions must be 
 * supported by twoStacks. 
 * 
 * push1(int x) –> pushes x to first stack
 * push2(int x) –> pushes x to second stack
 * 
 * pop1() –> pops an element from first stack and return the popped element
 * pop2() –> pops an element from second stack and return the popped element
 * 
 * @author ravi
 *
 */

public class TwoStacksInArray
{
    int arr[];
    int top1;
    int top2;
    int size;
    
    public TwoStacksInArray(int size)
    {
        this.size = size;
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        

    }
    
    public void push1(int element) throws Exception
    {
        if(top1 + 1 < top2)
        {
            top1++;
            arr[top1] = element;
        }
        else
        {
            throw new Exception("Stack overflow");
        }
    }
    
    public void push2(int element) throws Exception
    {
        if(top1 < top2 - 1)
        {
            top2--;
            arr[top2] = element;
        }
        else
        {
            throw new Exception("Stack overflow");
        }
    }
    
    public int pop1() throws Exception
    {
        if(top1 >= 0)
        {
            int elem = arr[top1];
            top1--;
            return elem;
        }
        else
        {
            throw new Exception("Stack underflow");
        }
    }
    
    public int pop2() throws Exception
    {
        if(top2 < size)
        {
            int elem = arr[top2];
            top2++;
            return elem;
        }
        else
        {
            throw new Exception("Stack underflow");
        }
    }
    
    

}
