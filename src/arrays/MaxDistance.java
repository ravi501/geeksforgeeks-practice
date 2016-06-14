package arrays;

/**
 * Given an array arr[], find the maximum j – i such that arr[j] > arr[i]
 * 
 * Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
 * Output: 6  (j = 7, i = 1)
 *
 * Input: {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}
 * Output: 8 ( j = 8, i = 0)
 *
 * Input:  {1, 2, 3, 4, 5, 6}
 * Output: 5  (j = 5, i = 0)
 *
 * Input:  {6, 5, 4, 3, 2, 1}
 * Output: -1 
 * 
 * @author ravi
 *
 */
public class MaxDistance
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int arr1[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int arr2[] = {1, 2, 3, 4, 5, 6};
        int arr3[] = {6, 5, 4, 3, 2, 1};
        
        System.out.println(maxDistance( arr ));
        System.out.println(maxDistance( arr1 ));
        System.out.println(maxDistance( arr2 ));
        System.out.println(maxDistance( arr3 ));
        
    }
    
    public static int maxDistance(int arr[])
    {
        int maxDistance = -1;
        for(int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++)
        {
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(arr[innerIndex] > arr[outerIndex])
                {
                    if(maxDistance < (innerIndex - outerIndex))
                    {
                        maxDistance = innerIndex - outerIndex;
                    }
                }
            }
        }
        
        return maxDistance;
    }

}
