package strings;

import java.util.HashMap;

/**
 * Print all the duplicates in the input string
 * 
 * Write an efficient C program to print all the duplicates and their counts in the input string
 * 
 * @author ravi
 *
 */
public class PrintAllDuplicates
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        String str = "geeksforgeeks";
        printDuplicatesAndCounts( str );
    }
    
    public static void printDuplicatesAndCounts(String str)
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
        
        for(int index = 0; index < str.length(); index++)
        {
            if(charCount.get( str.charAt( index ) ) != 0)
            {
                System.out.println(str.charAt( index ) + ", count = " + charCount.get( str.charAt( index ) ));
                charCount.put( str.charAt( index ), 0 );
                
            }
        }
    }

}
