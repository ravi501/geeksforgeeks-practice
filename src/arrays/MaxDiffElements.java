package arrays;

/**
 * Maximum difference between two elements such that larger element appears after the smaller number
 * 
 * Given an array arr[] of integers, find out the difference between any two elements such that larger 
 * element appears after the smaller number in arr[].
 * 
 * Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).
 * If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)
 * 
 * @author ravi
 *
 */
public class MaxDiffElements
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxDiffElementBigON( arr ));
        
        int arr1[] = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiffElementBigON( arr1 ));
        
        int arr2[] = {7, 9, 5, 3, 6, 2};
        System.out.println(maxDiffElementBigON( arr2 ));

    }
    
    public static int maxDiffElements(int arr[])
    {
        int maxDiff = 0;
        for(int outerIndex = 0; outerIndex < arr.length -1; outerIndex++)
        {
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(arr[innerIndex] > arr[outerIndex])
                {
                    int diff = arr[innerIndex] - arr[outerIndex];
                    if(diff > maxDiff)
                    {
                        maxDiff = diff;
                    }
                }
            }
        }
        return maxDiff;
    }
    
    public static int maxDiffElementBigON(int arr[])
    {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];
        
        for(int index = 1; index < arr.length; index++)
        {
            if(arr[index] - minElement > maxDiff)
            {
                maxDiff = arr[index] - minElement;
            }
            if(arr[index] < minElement)
            {
                minElement = arr[index];
            }
        }
        
        return maxDiff;
    }

}
