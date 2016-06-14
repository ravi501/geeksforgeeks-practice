package linkedlists;

/**
 * Write a function to reverse a linked list
 * 
 * @author ravi
 *
 */

public class ReverseLinkedList
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static SingleLinkedList reverseList(SingleLinkedList list)
    {
        if(list == null) 
            return null;
        
        if(list.nextLink == null)
            return list;
        
        SingleLinkedList secondElement = list.nextLink;
        
        list.nextLink = null;
        
        SingleLinkedList reverseSet = reverseList( secondElement );
        secondElement.nextLink = list;
               
        return reverseSet;
    }

}
