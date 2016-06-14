package linkedlists;

public class RemoveDuplicatesSortedLL
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        SingleLinkedList list = new SingleLinkedList( 1, null );
        SingleLinkedList list2 = new SingleLinkedList( 2, list );
        SingleLinkedList list3 = new SingleLinkedList( 2, list2 );
        SingleLinkedList list4 = new SingleLinkedList( 2, list3 );
        SingleLinkedList list5 = new SingleLinkedList( 5, list4 );
        SingleLinkedList list6 = new SingleLinkedList( 6, list5 );
        
        removeDuplicates( list6 );

    }

    public static SingleLinkedList removeDuplicates( SingleLinkedList list )
    {
        SingleLinkedList firstNode = list;
        
        SingleLinkedList currentNonRepeatNode = list;
        SingleLinkedList currentRepeatEndNode = list;
        list = list.nextLink;
        while ( list != null )
        {
            if ( list.data != currentNonRepeatNode.data )
            {
                if ( currentNonRepeatNode == currentRepeatEndNode )
                {

                    currentNonRepeatNode = list;
                    currentRepeatEndNode = list;
                }
                else
                {
                    currentNonRepeatNode.nextLink = currentRepeatEndNode.nextLink;
                    currentNonRepeatNode = currentRepeatEndNode;
                }
            }
            else
            {
                currentRepeatEndNode = list;
            }
            
            if(list.nextLink == null)
            {
                if ( currentNonRepeatNode == currentRepeatEndNode )
                {

                    currentNonRepeatNode = list;
                    currentRepeatEndNode = list;
                }
                else
                {
                    currentNonRepeatNode.nextLink = currentRepeatEndNode;
                    currentNonRepeatNode = currentRepeatEndNode;
                }
            }
            
            list = list.nextLink;

        }

        return firstNode;
    }
}
