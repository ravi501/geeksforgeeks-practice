package arrays;

import java.util.ArrayList;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * 
 * Write a C program that, given an array A[] of n numbers and another number x,
 * determines whether or not there exist two elements in S whose sum is exactly
 * x.
 * 
 * 
 * @author ravi
 * 
 */

public class PairWithSum
{

    public static void main( String[] args )
    {
        int arr[] =
        { 1, 4, 45, 6, 10, -8 };

        boolean doesExist = checkForPair( arr, 16 );
        System.out.println( doesExist );

        boolean hi = checkForPairSort( arr, 16 );
        System.out.println( hi );
    }

    public static boolean checkForPair( int arr[], int sum )
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for ( int index = 0; index < arr.length; index++ )
        {
            list.add( arr[index] );
        }

        for ( int index = 0; index < list.size(); index++ )
        {
            boolean doesContain = list.contains( sum - list.get( index ) );

            if ( doesContain )
                return true;
        }
        return false;
    }

    public static boolean checkForPairSort( int arr[], int sum )
    {
        for ( int outerIndex = 0; outerIndex < arr.length; outerIndex++ )
        {
            for ( int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++ )
            {
                if ( arr[outerIndex] > arr[innerIndex] )
                {
                    int temp = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }

        int innerIndex = 0;
        int outerIndex = arr.length - 1;
        while ( innerIndex < outerIndex )
        {
            if ( arr[innerIndex] + arr[outerIndex] == sum )
                return true;
            else if ( arr[innerIndex] + arr[outerIndex] < sum )
                innerIndex++;
            else
                outerIndex--;
        }

        return false;
    }

}
