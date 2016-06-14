package arrays;

import java.util.HashMap;

/**
 * Find the Number Occurring Odd Number of Times
 * 
 * Given an array of positive integers. All numbers occur even number of times
 * except one number which occurs odd number of times. Find the number in O(n)
 * time & constant space.
 * 
 * I/P = [1, 2, 3, 2, 3, 1, 3]
 * O/P = 3
 * 
 * @author ravi
 * 
 */
public class NumberOddTimes
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(findNumOddTimesSort( arr ));
        
        System.out.println(findNumOddTimesMap( arr ));

    }
    
    public static int findNumOddTimesSort( int arr[] )
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
                if(counter %2 != 0)
                    return currentElement;
                else
                {    
                    counter = 1;
                    currentElement = arr[index];
                }
            }
            
        }
        if(counter %2 != 0)
            return currentElement;

        return -1000;
    }

    public static int findNumOddTimesMap( int arr[] )
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
            if ( map.get( arr[index] ) %2 != 0 )
                return arr[index];
        }

        return -1000;
    }

}
