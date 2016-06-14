package strings;

/**
 * Reverse words in a given string
 * 
 * Example: Let the input string be “i like this program very much”. The function should change the string
 * to “much very program this like i”
 *
 * 
 * @author ravi
 *
 */
public class ReverseWordsString
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        String returnStr = reverseStringWords( "i like this program very much" );
        
        System.out.println(returnStr);

    }
    
    public static String reverseStringWords(String str)
    {
        String str1 = "";
        
        int prevAddedIndex = str.length() - 1;
        for(int index = str.length() - 1; index >=0; index--)
        {
            if(str.charAt( index ) == ' ')
            {
                str1 = str1.concat( str.substring( index + 1, prevAddedIndex + 1 ) );
                if(prevAddedIndex == str.length() - 1)
                {
                    str1 = str1.concat( " " );
                }
                prevAddedIndex = index;
            }
            
            if(index == 0)
            {
                str1 = str1.concat( str.substring( index, prevAddedIndex + 1 ) );
            }
        }
        
        
        
        return str1;
    }

}
