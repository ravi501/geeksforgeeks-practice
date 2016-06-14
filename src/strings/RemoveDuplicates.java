package strings;

/**
 * Remove all duplicates from a given string
 * 
 * @author ravi
 *
 */
public class RemoveDuplicates
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static char[] removeDuplicates(char arr[])
    {
        for(int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++)
        {
            for(int innerIndex = 0; innerIndex < arr.length; innerIndex++)
            {
                if(arr[outerIndex] > arr[innerIndex])
                {
                    char temp = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }
        
        char arr1[] = new char[arr.length];
        int currentIndex = 0;
        arr1[currentIndex] = arr[currentIndex];
        
        
        for(int index = 1; index < arr.length; index++)
        {
            if(arr[index] != arr[currentIndex])
            {
                currentIndex++;
                arr1[currentIndex] = arr[index];
            }
        }
        
        return arr1;
    }

}
