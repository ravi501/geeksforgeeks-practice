package stacks;

import java.util.Stack;

/**
 * Expression Evaluation
 * 
 * Evaluate an expression represented by a String. Expression can contain
 * parentheses, you can assume parentheses are well-matched. For simplicity, you
 * can assume only binary operations allowed are +, -, *, and /. Arithmetic
 * Expressions can be written in one of three forms:
 * 
 * Infix Notation: Operators are written between the operands they operate on,
 * e.g. 3 + 4 . Prefix Notation: Operators are written before the operands, e.g
 * + 3 4 Postfix Notation: Operators are written after operands.
 * 
 * "10 + 2 * 6" ---> 22 
 * "100 * 2 + 12" ---> 212 
 * "100 * ( 2 + 12 )" ---> 1400
 * "100 * ( 2 + 12 ) / 14" ---> 100
 * 
 * @author ravi
 * 
 */

public class ExpressionEvaluation
{
    private static Stack<Integer> operands = new Stack<Integer>();

    private static Stack<Character> operators = new Stack<Character>();

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        String expression1 = "10 + 2 * 6";
        String expression2 = "100 * 2 + 12";
        String expression3 = "100 * ( 2 + 12 ) / 14";
        
        int result1 = evaluationExpression( expression1 );
        System.out.println("Value = " + result1 + " for expression = " + expression1);
        
        int result2 = evaluationExpression( expression2 );
        System.out.println("Value = " + result2 + " for expression = " + expression2);
        
        int result3 = evaluationExpression( expression3 );
        System.out.println("Value = " + result3 + " for expression = " + expression3);

    }

    public static int evaluationExpression( String expression )
    {
        char exprArray[] = expression.toCharArray();

        for ( int index = 0; index < exprArray.length; index++ )
        {
            if ( exprArray[index] >= '0' && exprArray[index] <= '9' )
            {
                StringBuffer sbuf = new StringBuffer();
                while ( index < exprArray.length && exprArray[index] >= '0' && exprArray[index] <= '9' )
                    sbuf.append( exprArray[index++] );
                operands.push( Integer.parseInt( sbuf.toString() ) );
            }
            else if ( exprArray[index] == '(' )
                operators.push( exprArray[index] );
            else if ( exprArray[index] == ')' )
            {
                while ( operators.peek() != '(' )
                    operands.push( applyOperation( operators.pop(), operands.pop(), operands.pop() ) );
                operands.pop();
            }
            else if ( exprArray[index] == '+' || exprArray[index] == '-'
                      || exprArray[index] == '*'
                      || exprArray[index] == '/' )
            {
                while(!operators.isEmpty() && isPrecedence(exprArray[index], operators.peek()))
                    operands.push( applyOperation( operators.pop(), operands.pop(), operands.pop() ) );
                operators.push( exprArray[index] );
            }
        }
        
        while(!operands.empty())
            operands.push( applyOperation( operators.pop(), operands.pop(), operands.pop() ) );
        
        return operands.pop();
    }

    private static boolean isPrecedence( char c, Character peek )
    {
        // TODO Auto-generated method stub
        return false;
    }

    private static int applyOperation( Character pop, Integer pop2, Integer pop3 )
    {
        switch ( pop )
        {
        case '+':
            return pop2 + pop3;
        case '-':
            return pop2 - pop3;
        case '*':
            return pop2 * pop3;
        case '/':
            return pop2 / pop3;

        }
        return 0;
    }
}
