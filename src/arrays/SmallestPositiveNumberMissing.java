package arrays;

/**
 * Find the smallest positive number missing from an unsorted array
 * 
 * You are given an unsorted array with both positive and negative elements. You have to find the smallest 
 * positive number missing from the array in O(n) time using constant extra space. You can modify the 
 * original array.
 * 
 * Input:  {2, 3, 7, 6, 8, -1, -10, 15}
 * Output: 1
 *
 * Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
 * Output: 4
 *
 * Input: {1, 1, 0, -1, -2}
 * Output: 2 
 * 
 * @author ravi
 *
 */
public class SmallestPositiveNumberMissing
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {2, 3, 7, 6, 8, -1, -10, 15};
        int arr1[] = { 2, 3, -7, 6, 8, 1, -10, 15 };
        int arr2[] = {1, 1, 0, -1, -2};
        
        System.out.println(smallesMissingPositiveNumberUsingSort( arr ));
        System.out.println(smallesMissingPositiveNumberUsingSort( arr1 ));
        System.out.println(smallesMissingPositiveNumberUsingSort( arr2 ));

    }
    
    public static int smallesMissingPositiveNumber(int arr[])
    {
        int[] swappedArray = getIndex(arr);
        
        int nonNegativeIndex = 0;
        
        int arrSize = swappedArray.length;
        while(swappedArray[nonNegativeIndex] <= 0)
        {
            nonNegativeIndex++;
        }
        
        for(int index = nonNegativeIndex; index < swappedArray.length; index++)
        {
            if((swappedArray[index] - 1) < arrSize && swappedArray[swappedArray[index] - 1]  > 0)
            {
                swappedArray[swappedArray[index] - 1] = - swappedArray[swappedArray[index] - 1];
            }
        }
        
        for(int index = 0; index < swappedArray.length; index++)
        {
            if(swappedArray[index] > 0)
                return index + 1;
        }
        
        return -1;
    }
    
    private static int[] getIndex( int[] arr )
    {
        int nonNegativeIndex = 0;
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] <= 0)
            {
                int temp = arr[nonNegativeIndex];
                arr[nonNegativeIndex] = arr[index];
                arr[index] = temp;
                
                nonNegativeIndex++;
            }
        }
        return arr;
    }

    public static int smallesMissingPositiveNumberUsingSort(int arr[])
    {
        for(int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++)
        {
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(arr[outerIndex] > arr[innerIndex])
                {
                    int temp = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }
        
        int currentNum = 1;
        int index = 0;
        while(arr[index] <= 0)
            index++;
        
        while(index < arr.length)
        {
            if(arr[index] == currentNum)
            {
                index++;
                currentNum++;
            }
            else
                return currentNum;
        }
        
        return -1;
    }

}
