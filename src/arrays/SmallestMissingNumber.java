package arrays;

/**
 * Find the smallest missing number
 * 
 * Given a sorted array of n integers where each integer is in the range from 0 to m-1 and m > n. 
 * Find the smallest number that is missing from the array.
 * 
 * Examples
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10
 * Output: 3
 * 
 * Input: {4, 5, 10, 11}, n = 4, m = 12
 * Output: 0
 * 
 * Input: {0, 1, 2, 3}, n = 4, m = 5
 * Output: 4
 * 
 * Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
 * Output: 8
 * 
 * @author ravi
 *
 */
public class SmallestMissingNumber
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {0, 1, 2, 6, 9};
        int arr1[] = {4, 5, 10, 11};
        int arr2[] = {0, 1, 2, 3};
        int arr3[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        
        System.out.println(findSmallestMissingNumber( arr, 10 ));
        System.out.println(findSmallestMissingNumber( arr1, 12 ));
        System.out.println(findSmallestMissingNumber( arr2, 5 ));
        System.out.println(findSmallestMissingNumber( arr3, 11 ));

    }
    
    public static int findSmallestMissingNumber(int arr[], int range)
    {
        for(int index = 0; index < range; index++)
        {
            if(index > arr.length - 1)
            {
                return index;
            }
            
            if(arr[index] != index)
            {
                return index;
            }
        }
        
        return -1;
    }

}
