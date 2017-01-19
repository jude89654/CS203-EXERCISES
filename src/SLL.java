/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JUDE
 */
public class SLL 
{
    private SLLNode  head, tail;
    public SLL()
    {
        head=tail=null;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
   public void addToHead(int el)
   {
       head = new SLLNode( el, head);
       if(tail==null){
           tail=head;}
   }
   public void addToTail(int el)
   {
       if(isEmpty())
       {
           head=tail=new SLLNode(el);         
       }
       else
       {
           tail.next=new SLLNode(el);
           tail=tail.next;
       }
   }
   
   public int deleteFromHead()
   {
        if (isEmpty())
        {
            return 0; //nothing to delete
        }
        int el = (int)head.info;
        if (head == tail)
        {
            // only one node
            head = tail = null; // now empty list
        }
        else 
        {
        head = head.next; // next node is head
        }
        return el;
    }
  
    public int deleteFromTail() 
    {
        if (isEmpty()) 
        {
            return 0;
        }
        
        int el = (int)tail.info;

        if (head == tail) // only one node
        {
            head = tail = null;
        } 
        else 
        {

            SLLNode p; // find predecessor of tail
            for (p = head; p.next != tail; p = p.next) 
            tail = p; // predecessor of tail is the new tail
            tail.next = null;
        }
        return el;
    }
    
    
    @Override
    public String toString() 
    {

        SLLNode p = head;
        String s = "";

        for (p = head; p != null; p = p.next) 
        {
            s =  s +p.info +" ";
        }

        return s;
    }

    public SLLNode getNode(int el) 
    {
        SLLNode p = head;

        while (p != null && ((Comparable) p.info).compareTo(el) != 0)
        {
            p = p.next;
        }

        return p;
    } // a node if found, null if not

    public boolean isInList(int el)
    {

        return getNode(el) != null; // true if found, false if not

    }
    
    public void insertAfterNode(int el, SLLNode ptr) 
    {

        if (ptr != null) 
        {
            if (tail == ptr) 
            {
                addToTail(el);
            }
            else 
            {
                ptr.next = new SLLNode(el, ptr.next);
            }
        }

    }

    public void insertAfterElt(int elOld, int elNew)
    {

        SLLNode p;

        p = getNode(elOld); // find node with el

        if (p != null) 
        {
            insertAfterNode(elNew, p); // found, insert after
        }
    }
    public int delete(int el) { // delete node with element el

        if (isEmpty()) {
            return 0;
        }

        if (((Comparable) el).compareTo(head.info) == 0) {
            return deleteFromHead();
        }

        if (((Comparable) el).compareTo(tail.info) == 0) {
            return deleteFromTail();
        }

        SLLNode pred, t; // find el’s predecessor

        for (pred = head, t = head.next;
                t != null && ((Comparable) t.info).compareTo(el) != 0;
                pred = pred.next, t = t.next) ;

        if (t == null) {
            return 0; // if el was not found
        } else {
            pred.next = t.next;

            return el;
        }
    }
    
    public void insertAsc(int el)
    {
        SLLNode pred, t;
        
        if (isEmpty()) 
        {
            addToHead(el);
        }
        else if (head.info>=el)
        {
            addToHead(el);
        }
        else
        {
             for (pred = head,t=head.next;
                t!=null&&t.info<=el;
                pred = pred.next, t=t.next) ;
             
             if(pred.info>=el)
             {
                 
                 insertAfterElt(pred.info,el);
             }
             else
             {
                 addToTail(el);
             }
        }
    }
    
}
