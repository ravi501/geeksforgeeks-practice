package strings;

public class Anagrams
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        

    }

    public static boolean checkifAnagrams( char str1[], char str2[] )
    {
        if ( str1.length == str2.length )
        {
            for ( int outerIndex = 0; outerIndex < str1.length - 1; outerIndex++ )
            {
                for ( int innerIndex = outerIndex + 1; innerIndex < str1.length; innerIndex++ )
                {
                    if ( str1[outerIndex] < str1[innerIndex] )
                    {
                        char temp = str1[outerIndex];
                        str1[outerIndex] = str1[innerIndex];
                        str1[innerIndex] = temp;
                    }
                    
                    if ( str2[outerIndex] < str2[innerIndex] )
                    {
                        char temp = str2[outerIndex];
                        str2[outerIndex] = str2[innerIndex];
                        str2[innerIndex] = temp;
                    }

                }
            }
            
            for(int index = 0; index < str1.length; index++)
            {
                if(str1[index] != str2[index])
                    return false;
                
            }
            return true;
        }

        return false;
    }

}
