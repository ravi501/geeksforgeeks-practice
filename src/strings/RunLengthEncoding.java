package strings;

/**
 * Run Length Encoding
 * 
 * Given an input string, write a function that returns the Run Length Encoded
 * string for the input string.
 * 
 * For example, if the input string is “wwwwaaadexxxxxx”, then the function
 * should return “w4a3d1e1x6″.
 * 
 * Algorithm: a) Pick the first character from source string. b) Append the
 * picked character to the destination string. c) Count the number of subsequent
 * occurrences of the picked character and append the count to destination
 * string. d) Pick the next character and repeat steps b) c) and d) if end of
 * string is NOT reached.
 * 
 * @author ravi
 * 
 */
public class RunLengthEncoding
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        String encodedString = runLengthEncoding( "wwwwaaadexxxxxx" );
        System.out.println(encodedString);

    }

    public static String runLengthEncoding( String str )
    {
        String encodedString = "";

        char prevChar = str.charAt( 0 );
        int charCount = 1;
        for ( int index = 1; index < str.length(); index++ )
        {
            if ( str.charAt( index ) == prevChar )
            {
                charCount++;
            }
            else 
            {
                encodedString = encodedString.concat( String.valueOf( prevChar ) + String.valueOf( charCount ) );
                prevChar = str.charAt( index );
                charCount = 1;
            }
            
            if(index == str.length() - 1)
            {
                encodedString = encodedString.concat( String.valueOf( prevChar ) + String.valueOf( charCount ) ); 
            }
        }

        return encodedString;
    }

}
