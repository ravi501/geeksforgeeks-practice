package arrays;

/**
 * Find a sorted subsequence of size 3 in linear time
 * 
 * Given an array of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in 0(n) 
 * time. If there are multiple such triplets, then print any one of them.
 * 
 * Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
 * Output: 5, 6, 30
 *
 * Input:  arr[] = {1, 2, 3, 4}
 * Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4
 *
 * Input:  arr[] = {4, 3, 2, 1}
 * Output: No such triplet
 * 
 * @author ravi
 *
 */
public class SortedSubSequence
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {12, 11, 10, 5, 6, 2, 30};
        printSortedSubSequence( arr );
        printTriplet( arr );

    }
    
    public static void printTriplet(int arr[])
    {
        int n = arr.length;
        int min = 0;
        int max = n-1;
        
        int smaller[] = new int[n];
        int greater[] = new int[n];
        
        
        smaller[0] = -1;
        for(int index = 0; index < n; index++)
        {
            if(arr[index] <= arr[min])
            {
                min = index;
                smaller[index] = -1;
            }
            else
            {
                smaller[index] = min;
            }
        }
        
        greater[n-1] = -1;
        for(int index = n - 2; index >= 0; index--)
        {
            if(arr[index] >= arr[max])
            {
                max = index;
                greater[index] = -1;
            }
            else
            {
                greater[index] = max;
            }
        }
        
        for(int index = 0; index < n; index++)
        {
            if(smaller[index] != -1 && greater[index] != -1)
            {
                System.out.println(arr[smaller[index]] + " " + arr[index] + " " + arr[greater[index]]);
                return;
            }
        }
    }
    
    public static void printSortedSubSequence(int arr[])
    {
        for(int outerIndex = 0; outerIndex < arr.length - 2; outerIndex++)
        {
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length - 1; innerIndex++)
            {
                for(int innerInnerIndex = innerIndex + 1; innerInnerIndex < arr.length; innerInnerIndex++)
                {
                    if((arr[outerIndex] < arr[innerIndex]) && (arr[innerIndex] < arr[innerInnerIndex]))
                    {
                        System.out.println(arr[outerIndex] + " " + arr[innerIndex] + " " + arr[innerInnerIndex]);
                    }
                }
            }
        }
    }

}
