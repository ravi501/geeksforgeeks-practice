package linkedlists;

/**
 * Move last element to front of a given Linked List
 * 
 * Write a C function that moves last element to front in a given Singly Linked
 * List. For example, if the given Linked List is 1->2->3->4->5, then the
 * function should change the list to 5->1->2->3->4.
 * 
 * @author ravi
 * 
 */
public class MoveLastToFirst
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        SingleLinkedList list = new SingleLinkedList( 5, null );
        SingleLinkedList list2 = new SingleLinkedList( 4, list );
        SingleLinkedList list3 = new SingleLinkedList( 3, list2 );
        SingleLinkedList list4 = new SingleLinkedList( 2, list3 );
        SingleLinkedList list5 = new SingleLinkedList( 1, list4 );
        
        SingleLinkedList returnList =  moveLastToFirst( list5 );
        
        System.out.println(returnList.nextLink.data);

    }
    
    public static SingleLinkedList moveLastToFirst(SingleLinkedList list)
    {
        SingleLinkedList front = list;
        
        while(list.nextLink.nextLink != null)
        {
            list = list.nextLink;
        }
        
        SingleLinkedList lastLink = list;
        list = list.nextLink;
        lastLink.nextLink = null;
        
        list.nextLink = front;
        
        return list;
        
    }

}
