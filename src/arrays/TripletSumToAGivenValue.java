package arrays;

/**
 * Find a triplet that sum to a given value
 * 
 * Given an array and a value, find if there is a triplet in array whose sum is
 * equal to the given value. If there is such a triplet present in array, then
 * print the triplet and return true. Else return false. For example, if the
 * given array is {12, 3, 4, 1, 6, 9} and given sum is 24, then there is a
 * triplet (12, 3 and 9) present in array whose sum is 24.
 * 
 * @author ravi
 * 
 */
public class TripletSumToAGivenValue
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {12, 3, 4, 1, 6, 9};
        tripletSumToGivenValue( arr, 24 );
        tripletSumToGivenValueSort( arr, 24 );

    }
    
    public static void tripletSumToGivenValueSort(int arr[], int sum)
    {
        for ( int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++ )
        {
            for ( int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++ )
            {
                if(arr[outerIndex] > arr[innerIndex])
                {
                    int temp = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }
        
        
        for(int index = 0; index < arr.length; index++)
        {
            int leftIndex = index + 1;
            int rightIndex = arr.length - 1;
            
            while(leftIndex < rightIndex)
            {
                if(arr[index] + arr[leftIndex] + arr[rightIndex] == sum)
                {
                    System.out.println( "Triplet = " + arr[index]
                            + " "
                            + arr[leftIndex]
                            + " "
                            + arr[rightIndex] );
                    break;
                }
                else if(arr[index] + arr[leftIndex] + arr[rightIndex] < sum)
                {
                    leftIndex++;
                }
                else
                {
                    rightIndex--;
                }
            }
        }
        
    }

    public static void tripletSumToGivenValue( int arr[], int sum )
    {
        for ( int outerIndex = 0; outerIndex < arr.length - 2; outerIndex++ )
        {
            for ( int innerIndex = outerIndex + 1; innerIndex < arr.length - 1; innerIndex++ )
            {
                for ( int innerInnerIndex = innerIndex + 1; innerInnerIndex < arr.length; innerInnerIndex++ )
                {
                    if ( arr[outerIndex] + arr[innerIndex] + arr[innerInnerIndex] == sum )
                    {
                        System.out.println( "Triplet = " + arr[outerIndex]
                                            + " "
                                            + arr[innerIndex]
                                            + " "
                                            + arr[innerInnerIndex] );
                    }
                }
            }
        }
    }

}
