package arrays;

/**
 * Union and Intersection of two sorted arrays
 * 
 * Given two sorted arrays, find their union and intersection.
 *
 * For example, if the input arrays are: 
 * arr1[] = {1, 3, 4, 5, 7}
 * arr2[] = {2, 3, 5, 6}
 * 
 * Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}. 
 * 
 * @author ravi
 *
 */
public class UnionAndIntersectionArrays
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        
        printUnion( arr1, arr2 );
        printIntersection( arr1, arr2 );

    }
    
    public static void printUnion(int arr1[], int arr2[])
    {
        int index1 = 0;
        int index2 = 0;
        
        while(index1 < arr1.length || index2 < arr2.length)
        {
            if(index1 == arr1.length)
            {
                System.out.println(arr2[index2]);
                index2++;
            }
            else if(index2 == arr2.length)
            {
                System.out.println(arr1[index1]);
                index1++;
            }
            else
            {
                if(arr1[index1] < arr2[index2])
                {
                    System.out.println(arr1[index1]);
                    index1++;
                }
                else if(arr1[index1] > arr2[index2])
                {
                    System.out.println(arr2[index2]);
                    index2++;
                }
                else
                {
                    System.out.println(arr1[index1]);
                    index1++;
                    index2++;
                }
            }
        }
    }
    
    public static void printIntersection(int arr1[], int arr2[])
    {
        int index1 = 0;
        int index2 = 0;
        
        System.out.println("======================================");
        while(index1 < arr1.length && index2 < arr2.length)
        {
            if(arr1[index1] == arr2[index2])
            {
                System.out.println(arr1[index1]);
                index1++;
                index2++;
            }
            else if (arr1[index1] < arr2[index2])
            {
                index1++;
            }
            else
            {
                index2++;
            }
        }
    }

}
