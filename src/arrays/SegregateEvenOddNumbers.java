package arrays;

/**
 * Segregate Even and Odd numbers
 * 
 * Given an array A[], write a function that segregates even and odd numbers. The functions should put 
 * all even numbers first, and then odd numbers.
 * 
 * Input  = {12, 34, 45, 9, 8, 90, 3}
 * Output = {12, 34, 8, 90, 45, 9, 3} 
 * 
 * @author ravi
 *
 */
public class SegregateEvenOddNumbers
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int inputArr[] = {12, 34, 45, 9, 8, 90, 3};
        int response[] = segregateEvenOdd( inputArr );
        
        for(int index = 0; index < response.length; index++)
        {
            System.out.println(response[index]);
        }

    }
    
    public static int[] segregateEvenOdd(int arr[])
    {
        int evenCount = 0;
        
        for(int index = 0; index < arr.length; index++)
        {
            if((arr[index] % 2 == 0 ))
            {
                evenCount++;
            }
                
        }
        
        for(int index = 0; index < arr.length; index++)
        {
            if((arr[index] % 2 != 0 ))
            {
                if(index < evenCount)
                {
                    int innerIndex = index;
                    while(arr[innerIndex] %2 != 0)
                    {
                        innerIndex++;
                    }
                    
                    int temp = arr[index];
                    arr[index] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }
        
        return arr;
    }

}
