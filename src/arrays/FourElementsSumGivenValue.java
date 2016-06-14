package arrays;

/**
 * Find four elements that sum to a given value | Set 1 (n^3 solution)
 * 
 * Given an array of integers, find all combination of four elements in the array whose sum is equal to a 
 * given value X.
 * 
 * For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23, then your function should print 
 * “3 5 7 8″ (3 + 5 + 7 + 8 = 23).
 * 
 * @author ravi
 *
 */
public class FourElementsSumGivenValue
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static void findFour(int arr[], int sum)
    {
        for(int i = 0; i < arr.length - 3; i++)
        {
            for(int j = i + 1; j < arr.length - 2; j++)
            {
                for(int k = 0; k < arr.length - 1; k++)
                {
                    for(int l = 0; l < arr.length; l++)
                    {
                        if(arr[i] + arr[j] + arr[k] + arr[l] == sum)
                        {
                            System.out.println(arr[i] + arr[j] + arr[k] + arr[l]);
                        }
                    }
                }
            }
        }
    }

}
