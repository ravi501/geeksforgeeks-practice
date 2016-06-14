package arrays;

/**
 * Find the two numbers with odd occurrences in an unsorted array
 * 
 * Given an unsorted array that contains even number of occurrences for all numbers except two numbers. 
 * Find the two numbers which have odd occurrences in O(n) time complexity and O(1) extra space.
 * 
 * Input: {12, 23, 34, 12, 12, 23, 12, 45}
 * Output: 34 and 45
 *
 * Input: {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100}
 * Output: 100 and 5000
 *
 * Input: {10, 20}
 * Output: 10 and 20
 * 
 * @author ravi
 *
 */
public class NumberOddOccurences
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {12, 23, 34, 12, 12, 23, 12, 45};
        int arr1[] = {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100};
        int arr2[] = {10, 20};
        findTwoOddOccurences( arr );
        System.out.println("========================");
        findTwoOddOccurences( arr1 );
        System.out.println("========================");
        findTwoOddOccurences( arr2 );

    }
    
    public static void findTwoOddOccurences(int arr[])
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
        
        int num = arr[0];
        int count = 1;
        for(int index = 1; index < arr.length; index++)
        {
            if(num == arr[index])
            {
                count++;
            }
            else
            {
                if(count % 2 != 0)
                {
                    System.out.println(num);
                }
                num = arr[index];
                count = 1;
            }
            
            if(index == arr.length - 1)
            {
                if(count % 2 != 0)
                {
                    System.out.println(num);
                }
            }
        }
    }

}
