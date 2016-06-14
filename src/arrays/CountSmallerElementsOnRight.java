package arrays;

/**
 * Count smaller elements on right side
 * 
 * Write a function to count number of smaller elements on right of each element in an array. 
 * Given an unsorted array arr[] of distinct integers, construct another array countSmaller[] such 
 * that countSmaller[i] contains count of smaller elements on right side of each element arr[i] in array.
 * 
 * Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
 * Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 
 *
 * (Corner Cases)
 * Input:   arr[] =  {5, 4, 3, 2, 1}
 * Output:  countSmaller[]  =  {4, 3, 2, 1, 0} 
 *
 * Input:   arr[] =  {1, 2, 3, 4, 5}
 * Output:  countSmaller[]  =  {0, 0, 0, 0, 0}
 * 
 * @author ravi
 *
 */
public class CountSmallerElementsOnRight
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {5, 4, 3, 2, 1};
        countSmaller( arr );

    }

    public static int[] countSmaller(int arr[])
    {
        int smaller[] = new int[arr.length];
                
        for(int outerIndex = 0; outerIndex < arr.length; outerIndex++)
        {
            int count = 0;
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(arr[outerIndex] > arr[innerIndex])
                    count++;
            }
            smaller[outerIndex] = count;
            System.out.println(count);
        }
                
        return smaller;
    }
}
