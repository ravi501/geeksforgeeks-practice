package linkedlists;

/**
 * Write a function to get Nth node in a Linked List
 * 
 * Write a GetNth() function that takes a linked list and an integer index and returns the data value stored 
 * in the node at that index position.
 * 
 * @author ravi
 *
 */
public class GetNthNode
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
        
        int nthNode = getNthNode( list6, 3 );
        System.out.println(nthNode);

    }
    
    public static int getNthNode(SingleLinkedList list, int N)
    {
        int count = 0;
                
        while(count < N)
        {
            list = list.nextLink;
            count++;
        }
        
        return list.data;
    }

}
