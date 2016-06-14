package arrays;

/**
 * Program for array rotation
 * 
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * Input: 1, 2, 3, 4, 5, 6, 7
 * 
 * Rotate array by 2
 * 
 * Output: 3, 4, 5, 6, 7, 1, 2
 * 
 * @author ravi
 *
 */
public class ArrayRotation
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        
        for(int index = 0; index < 2; index++)
        {
            arr = rotateArrayByOne( arr );
        }
        
        for(int index = 0; index < arr.length; index++)
        {
            System.out.println(arr[index]);
        }

    }
    
    public static int[] rotateArrayByOne(int arr[])
    {
        int firstElement = arr[0];
        for(int index = 1; index < arr.length; index++)
        {
            arr[index - 1] = arr[index];
        }
        arr[arr.length - 1] = firstElement;
        
        return arr;
    }

}
