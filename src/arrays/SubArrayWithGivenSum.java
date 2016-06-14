package arrays;

/**
 * Find sub-array with given sum
 * 
 * Given an unsorted array of nonnegative integers, find a continuous sub-array which adds to a given number.
 * 
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * Output: Sum found between indexes 2 and 4
 *
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 * Ouptut: Sum found between indexes 1 and 4
 *
 * Input: arr[] = {1, 4}, sum = 0
 * Output: No subarray found
 * 
 * @author ravi
 *
 */
public class SubArrayWithGivenSum
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int arr1[] = {1, 4, 0, 0, 3, 10, 5};
        int arr2[] = {1,4};
        
        subArrayWithGivenSum( arr, 33 );
        subArrayWithGivenSum( arr1, 7 );
        subArrayWithGivenSum( arr2, 0 );
    }
    
    public static void subArrayWithGivenSum(int arr[], int sum)
    {
        for(int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++)
        {
            int sumSubArray = arr[outerIndex];
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(sumSubArray + arr[innerIndex] > sum)
                    break;
                else
                {
                    sumSubArray += arr[innerIndex];
                }
                
                if(sumSubArray == sum)
                {
                    System.out.println(outerIndex + " to " + innerIndex);
                    break;
                }
                
            }
        }
        
        
    }

}
