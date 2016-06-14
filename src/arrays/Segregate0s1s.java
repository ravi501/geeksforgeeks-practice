package arrays;

/**
 * Segregate 0s and 1s in an array
 * 
 * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of
 * the array. Traverse array only once.
 * 
 * Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
 * Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
 * 
 * @author ravi
 *
 */
public class Segregate0s1s
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static int[] segregate0sAnd1sByZeroCount(int arr[])
    {
        int zeroCount = 0;
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] == 0)
            {
                zeroCount++;
            }
        }
        
        for(int index = 0; index < arr.length; index++)
        {
            if(index < zeroCount)
            {
                arr[index] = 0;
            }
            else
            {
                arr[index] = 1;
            }
        }
        
        return arr;
    }
}
