package arrays;

/**
 * Leaders in an array
 * 
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all 
 * the elements to its right side. And the rightmost element is always a leader. For example int the 
 * array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 * 
 * @author ravi
 *
 */
public class LeadersInArray
{

    public static void main( String[] args )
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        printLeadersInArray( arr );

    }
    
    public static void printLeadersInArray(int arr[])
    {
        int leader = -200;
        for(int index = arr.length - 1; index >= 0; index--)
        {
            if(arr[index] > leader)
            {
                leader = arr[index];
                System.out.println(leader);
            }
        }
    }
    
    

}
