package linkedlists;

/**
 * Given only a pointer/reference to a node to be deleted in a singly linked list, how do you delete it?
 * 
 * A simple solution is to traverse the linked list until you find the node you want to delete. But this 
 * solution requires pointer to the head node which contradicts the problem statement. 
 * 
 * @author ravi
 *
 */
public class DeleteReferencedNode
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
        
        SingleLinkedList nthNode = deleteReferencedNode( list3);
        System.out.println(nthNode);

    }

    public static SingleLinkedList deleteReferencedNode(SingleLinkedList list)
    {
        SingleLinkedList nextNode = list.nextLink;
        
        list.data = nextNode.data;
        list.nextLink = nextNode.nextLink;
        
        return list;
    }
    
}
