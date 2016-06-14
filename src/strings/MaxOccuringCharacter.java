package strings;

import java.util.HashMap;

/**
 * Return maximum occurring character in the input string
 * 
 * Write an efficient C function to return maximum occurring character in the input string e.g., if input string
 * is “test” then function should return ‘t’.
 * 
 * @author ravi
 *
 */
public class MaxOccuringCharacter
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        char ch = maxOccuringCharacter( "test" );
        System.out.println(ch);

    }
    
    public static char maxOccuringCharacter(String str)
    {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        
        for(int index = 0; index < str.length(); index++)
        {
            if(charCount.containsKey( str.charAt( index ) ))
            {
                int count = charCount.get( str.charAt( index ) );
                count++;
                charCount.put( str.charAt( index ), count );
            }
            else
            {
                charCount.put( str.charAt( index ), 1 );
            }
        }
        
        int maxCount = 0;
        char maxChar = str.charAt( 0 );
        
        for(int index = 1; index < str.length(); index++)
        {
            if(maxCount < charCount.get( str.charAt( index ) ))
            {
                maxCount = charCount.get( str.charAt( index ) );
                maxChar = str.charAt( index );
            }
        }
        
        return maxChar;
    }

}
