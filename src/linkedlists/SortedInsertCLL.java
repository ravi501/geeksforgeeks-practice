package linkedlists;

public class SortedInsertCLL
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        

    }
    
    public static SingleLinkedList sortedInsert(SingleLinkedList list, int data)
    {
        SingleLinkedList newNode = new SingleLinkedList( data, null );
        SingleLinkedList front = list;
        if(list == null)
        {
            list = newNode;
        }
        else if(list.data >= newNode.data)
        {
            newNode.nextLink = front;
            
            while(list.nextLink != front)
            {
                list = list.nextLink;
            }
            
            list.nextLink = newNode;
        
        }
        else
        {
            while(list.data < newNode.data && newNode.data > list.nextLink.data)
            {
                list = list.nextLink;
            }
            
            newNode.nextLink = list.nextLink;
            list.nextLink = newNode;
        }
        
        
        return list;
    }

}
