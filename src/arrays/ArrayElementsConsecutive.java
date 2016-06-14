package arrays;

import java.util.HashMap;

/**
 * Check if array elements are consecutive
 * 
 * Given an unsorted array of numbers, write a function that returns true if array consists of 
 * consecutive numbers.
 * 
 * Examples:
 * a) If array is {5, 2, 3, 1, 4}, then the function should return true because the array has 
 * consecutive numbers from 1 to 5.
 *
 * b) If array is {83, 78, 80, 81, 79, 82}, then the function should return true because the array 
 * has consecutive numbers from 78 to 83.
 *
 * c) If the array is {34, 23, 52, 12, 3 }, then the function should return false because the elements 
 * are not consecutive.
 *
 * d) If the array is {7, 6, 5, 5, 3, 4}, then the function should return false because 5 and 5 are not
 * consecutive.
 * 
 * @author ravi
 *
 */
public class ArrayElementsConsecutive
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr[] = {5, 2, 3, 1, 4};
        int arr1[] = {83, 78, 80, 81, 79, 82};
        int arr2[] = {34, 23, 52, 12, 3 };
        int arr3[] = {7, 6, 5, 5, 3, 4};
        
        System.out.println(isConsecutive( arr ));
        System.out.println(isConsecutive( arr1 ));
        System.out.println(isConsecutive( arr2 ));
        System.out.println(isConsecutive( arr3 ));

    }

    public static boolean isConsecutive(int arr[])
    {
        int minElement = arr[0];
        
        for(int index = 1; index < arr.length; index++)
        {
            if(arr[index] < minElement )
            {
                minElement = arr[index];
            }
        }
        
        int maxElement = minElement + arr.length - 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int index = 0; index < arr.length; index++)
        {
            if(map.containsKey( arr[index] ))
            {
                return false;
            }
            if(arr[index] < minElement || arr[index] > maxElement)
            {
                return false;
            }
            else
            {
                map.put( arr[index], 1 );
            }
        }
        
        
        return true;
    }
}
