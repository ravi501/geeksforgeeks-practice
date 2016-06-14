package strings;

/**
 * Print reverse of a string using recursion
 * 
 * @author ravi
 * 
 */
public class ReverseStringUsingRecusrion
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        String str = "Geeks for Geeks";
        String rev = printReverseString( str );
        System.out.println(rev);
    }

    public static String printReverseString( String str )
    {
        String reverse = "";
        if ( str.length() == 1 )
        {
            return str;
        }
        else
        {
            reverse = reverse + str.charAt( str.length() - 1 )
                      + printReverseString( str.substring( 0, str.length() - 1 ) );
            return reverse;
        }
    }

}
