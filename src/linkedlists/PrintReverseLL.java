package linkedlists;

/**
 * Write a recursive function to print reverse of a Linked List
 * 
 * Given a linked list, print reverse of it using a recursive function. For example, if the given linked list 
 * is 1->2->3->4, then output should be 4->3->2->1.
 * 
 * @author ravi
 *
 */
public class PrintReverseLL
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        SingleLinkedList list = new SingleLinkedList( 1, null );
        SingleLinkedList list2 = new SingleLinkedList( 2, list );
        SingleLinkedList list3 = new SingleLinkedList( 3, list2 );
        SingleLinkedList list4 = new SingleLinkedList( 4, list3 );
        SingleLinkedList list5 = new SingleLinkedList( 5, list4 );
        SingleLinkedList list6 = new SingleLinkedList( 6, list5 );
        
        printReverseList( list6 );

    }
    
    public static void printReverseList(SingleLinkedList list)
    {
        if(list == null)
        {
            return;
            
        }
        printReverseList( list.nextLink );
        
        System.out.println(list.data);
    }

}
