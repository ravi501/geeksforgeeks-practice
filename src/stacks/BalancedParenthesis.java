package stacks;

import java.util.Stack;

public class BalancedParenthesis
{
    Stack<Character> stack;
    
    public BalancedParenthesis()
    {
        stack = new Stack<Character>();
    }
    
    public boolean isMatchingPair(char parenthesis1, char parenthesis2)
    {
        if(parenthesis1 == '{' && parenthesis2 == '}')
            return true;
        else if(parenthesis1 == '[' && parenthesis2 == ']')
            return true;
        else if(parenthesis1 == '(' && parenthesis2 == ')')
            return true;
        else 
            return false;
    }
    
    public boolean checkBalancedParenthesis(String parenthesis)
    {
        for(int index = 0; index < parenthesis.length() - 1; index++)
        {
            if( parenthesis.charAt( index ) == '{' || parenthesis.charAt( index ) == '[' || parenthesis.charAt( index ) == '(')
            {
                stack.push( parenthesis.charAt( index ) );
            }
            else if(parenthesis.charAt( index ) == '}' || parenthesis.charAt( index ) == ']' || parenthesis.charAt( index ) == ')')
            {
                if(stack.size() == 0)
                    return false;
                
                if(!isMatchingPair( stack.pop(), parenthesis.charAt( index ) ))
                {
                    return false;
                }
            }
        }
        if(stack.size() == 0)
            return true;
        else
            return false;
    }
    
    
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }

}
