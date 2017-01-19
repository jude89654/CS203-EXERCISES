/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE #
 */


public class DLLNode <T> {
    public T info;
    public DLLNode prev,next;
    
    public DLLNode()
    {
        next=prev=null;
    }
    
    public DLLNode(T element)
    {
        info=element;
    }
    
    public DLLNode(T element, DLLNode<T> prev, DLLNode<T> next)
    {
        info=element;
        this.prev=prev;
        this.next=next;
    }
}
