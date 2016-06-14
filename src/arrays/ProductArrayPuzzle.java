package arrays;

/**
 * A Product Array Puzzle
 * 
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] 
 * is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator 
 * and in O(n).
 *
 * @author ravi
 *
 */
public class ProductArrayPuzzle
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static int[] productArray(int arr[])
    {
        int productArray[] = new int[arr.length];
        for(int outerIndex = 0; outerIndex < arr.length; outerIndex++)
        {
            int product = 1;
            for(int innerIndex = 0; innerIndex < arr.length; innerIndex++)
            {
                if(outerIndex == innerIndex)
                {
                    product = product*1;
                }
                else
                {
                    product = product * arr[innerIndex];
                }
            }
            productArray[outerIndex] = product;
        }
        
        return productArray;
    }
    
    public static int[] productArrayON(int arr[])
    {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int productArray[] = new int[arr.length];
        
        left[0] = 1;
        right[arr.length - 1] = 1;
        
        for(int index = 1; index < arr.length; index++)
        {
            left[index] = left[index - 1] * arr[index - 1];
        }
        
        for(int index = arr.length - 2; index >= 0; index--)
        {
            right[index] = right[index + 1] * arr[index + 1];
        }
        
        for(int index = 0; index < arr.length; index++)
        {
            productArray[index] = left[index] * right[index];
        }
        
        return productArray;
    }

}
