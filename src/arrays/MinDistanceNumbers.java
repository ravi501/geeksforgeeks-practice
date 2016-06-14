package arrays;

/**
 * Find the minimum distance between two numbers
 * 
 * Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. 
 * The array might also contain duplicates. You may assume that both x and y are different and present 
 * in arr[].
 * 
 * Input: arr[] = {1, 2}, x = 1, y = 2
 * Output: Minimum distance between 1 and 2 is 1.
 * 
 * Input: arr[] = {3, 4, 5}, x = 3, y = 5
 * Output: Minimum distance between 3 and 5 is 2.
 * 
 * Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
 * Output: Minimum distance between 3 and 6 is 4.
 * 
 * Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
 * Output: Minimum distance between 3 and 2 is 1.
 * 
 * @author ravi
 *
 */
public class MinDistanceNumbers
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {1, 2};
        int arr1[] = {3, 4, 5};
        int arr2[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int arr3[] = {2, 5, 3, 5, 4, 4, 2, 3};
        
        System.out.println(minDistance( arr, 1, 2 ));
        System.out.println(minDistance( arr1, 3, 5 ));
        System.out.println(minDistance( arr2, 3, 6 ));
        System.out.println(minDistance( arr3, 3, 2 ));

    }

    public static int minDistance(int arr[], int x, int y)
    {
        int minDistance = 100;
        int prev = 1000;
        
        
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] == x || arr[index] == y)
            {
                prev = index;
                break;
            }
        }
        
        for(int index = prev + 1; index < arr.length; index++)
        {
            if(arr[index] == x || arr[index] == y)
            {
                if(arr[prev] != arr[index] && (index - prev) < minDistance)
                {
                    minDistance = index - prev;
                    prev = index;
                }
                else
                {
                    prev = index;
                }
            }
        }
        
        return minDistance;
        
    }
    
}
