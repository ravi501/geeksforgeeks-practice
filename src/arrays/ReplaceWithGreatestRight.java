package arrays;

/**
 * Replace every element with the greatest element on right side
 * 
 * Given an array of integers, replace every element with the next greatest element (greatest element on the 
 * right side) in the array. Since there is no element next to the last element, replace it with -1. For 
 * example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 * 
 * 
 * 
 * @author ravi
 *
 */
public class ReplaceWithGreatestRight
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int arr1[] = replaceGreatestRight( arr );
        
        for(int index = 0; index < arr.length; index++)
        {
            System.out.print(arr1[index] + " ");
        }

    }
    
    public static int[] replaceGreatestRight(int arr[])
    {
        int greatestRight = -1;// arr[arr.length - 1];
        
        for(int index = arr.length - 1; index >= 0; index--)
        {
            int currentNum = arr[index];
            arr[index] = greatestRight;
            
            if(currentNum > greatestRight)
                greatestRight = currentNum;
        }
        
        return arr;
    }

}
