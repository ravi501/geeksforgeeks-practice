package linkedlists;

public class MergeLLs
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

    }
    
    public static SingleLinkedList mergeLinkedLists(SingleLinkedList list1, SingleLinkedList list2)
    {
        if(list1 == null)
            return list2;
        
        if(list2 == null)
            return list1;
        
        if(list1.data < list2.data)
        {
            list1.nextLink = mergeLinkedLists( list1.nextLink, list2 );
            return list1;
        }
        else
        {
            list2.nextLink = mergeLinkedLists( list2.nextLink, list1 );
            return list2;
        }
    }

}
