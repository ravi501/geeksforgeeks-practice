package arrays;

/**
 * Write a program to reverse an array or string
 * 
 * 
 * 
 * @author ravi
 *
 */
public class ReverseAnArray
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int[] reverseArr = reverseAnArray( arr1 );
        
        for(int index = 0; index < reverseArr.length; index++)
        {
            System.out.println(reverseArr[index]);
        }

    }
    
    public static int[] reverseAnArray(int arr[])
    {
        int lowerIndex = 0, upperIndex = arr.length - 1;
        while(lowerIndex < upperIndex)
        {
            int tempVar = arr[lowerIndex];
            arr[lowerIndex] = arr[upperIndex];
            arr[upperIndex] = tempVar;
            
            lowerIndex++;
            upperIndex--;
        }
        
        return arr;
    }

}
