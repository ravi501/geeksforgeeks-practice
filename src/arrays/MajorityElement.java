package arrays;

import java.util.HashMap;

/**
 * Majority Element
 * 
 * Majority Element: A majority element in an array A[] of size n is an element
 * that appears more than n/2 times (and hence there is at most one such
 * element).
 * 
 * Write a function which takes an array and emits the majority element (if it
 * exists), otherwise prints NONE as follows:
 * 
 * I/P : 3 3 4 2 4 4 2 4 4 O/P : 4
 * 
 * I/P : 3 3 4 2 4 4 2 4 O/P : NONE
 * 
 * @author ravi
 * 
 */
public class MajorityElement
{

    public static void main( String[] args )
    {
        int arr[] =
        { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

        int arr1[] =
        { 3, 3, 4, 2, 4, 4, 2, 4 };

        System.out.println( findMajorityElementBySort( arr ) );
        System.out.println( findMajorityElementByMap( arr ) );

        System.out.println( findMajorityElementBySort( arr1 ) );
        System.out.println( findMajorityElementByMap( arr1 ) );

    }

    public static int findMajorityElementBySort( int arr[] )
    {
        for ( int outerIndex = 0; outerIndex < arr.length; outerIndex++ )
        {
            for ( int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++ )
            {
                if ( arr[outerIndex] > arr[innerIndex] )
                {
                    int tempVar = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = tempVar;
                }
            }
        }

        int counter = 0;
        int currentElement = arr[0];

        for ( int index = 0; index < arr.length; index++ )
        {
            if ( arr[index] == currentElement )
            {
                counter++;
            }
            else
            {
                counter = 1;
                currentElement = arr[index];
            }

            if ( counter > arr.length / 2 )
            {
                return currentElement;
            }
        }

        return -1000;
    }

    public static int findMajorityElementByMap( int arr[] )
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for ( int index = 0; index < arr.length; index++ )
        {
            if ( map.containsKey( arr[index] ) )
            {
                int count = map.get( arr[index] );
                count++;
                map.put( arr[index], count );
            }
            else
            {
                map.put( arr[index], 1 );
            }
        }

        for ( int index = 0; index < arr.length; index++ )
        {
            if ( map.get( arr[index] ) > arr.length / 2 )
                return arr[index];
        }

        return -1000;
    }

}
