package arrays;

import java.util.HashMap;

/**
 * Find the two repeating elements in a given array
 * 
 * You are given an array of n+2 elements. All elements of the array are in range 1 to n. And all elements
 * occur once except two numbers which occur twice. Find the two repeating numbers.
 * 
 * For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
 * 
 * The above array has n + 2 = 7 elements with all elements occurring once except 2 and 4 which occur twice. 
 * So the output should be 4 2.
 * 
 * @author ravi
 *
 */
public class RepeatingElementsArray
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        repeatingElementsMap( arr );
        repeatingelementsSort( arr );

    }
    
    public static void repeatingElementsMap(int arr[])
    {
        HashMap<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
        
        for(int index = 0; index < arr.length; index++)
        {
            if(elementMap.containsKey( arr[index] ))
            {
                System.out.println(arr[index]);
            }
            else
            {
                int value = 1;
                elementMap.put( arr[index], value );
            }
        }
    }
    
    public static void repeatingelementsSort(int arr[])
    {
        for(int outerIndex = 0; outerIndex < arr.length - 1; outerIndex++)
        {
            for(int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++)
            {
                if(arr[outerIndex] == arr[innerIndex])
                {
                    System.out.println(arr[outerIndex]);
                }
            }
        }
    }

}
