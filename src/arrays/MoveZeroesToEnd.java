package arrays;

/**
 * Move all zeroes to end of array
 * 
 * Given an array of random numbers, Push all the zero’s of a given array to the
 * end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2,
 * 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The
 * order of all other elements should be same. Expected time complexity is O(n)
 * and extra space is O(1).
 * 
 * @author ravi
 * 
 */
public class MoveZeroesToEnd
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] =
        { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
        int arr1[] = moveZeroesToEnd( arr );

        for ( int index = 0; index < arr.length; index++ )
        {
            System.out.print( arr1[index] + " " );
        }

    }

    public static int[] moveZeroesToEnd( int arr[] )
    {
        int count = 0;
        for( int index = 0; index < arr.length; index++ )
        {
            if(arr[index] != 0)
            {
                arr[count] = arr[index];
                count++;
            }
        }
        
        while(count < arr.length)
        {
            arr[count++] = 0;
        }

        return arr;
    }

}
