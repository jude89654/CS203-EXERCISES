/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE #
 */

public class DLL<T> {

    public static void main(String args[]) {
        System.out.print("NAME");
        DLL d1 = new DLL();

        d1.addToTail(50);
        d1.addToTail(60);
        d1.addToTail(70);
        d1.addToTail(80);
        d1.addToTail(90);
        d1.addToHead(40);
        d1.addToHead(30);
        d1.addToHead(20);
        d1.addToHead(10);
        System.out.println(d1.toString());
        d1.deleteFromTail();
        d1.deleteFromTail();
        d1.deleteFromTail();

        d1.deleteFromHead();
        d1.deleteFromHead();
        System.out.println(d1.toString());
        
        
        DLL d2= new DLL();
        d2.addToTail("B");
        d2.addToTail("Y");
        System.out.print(d2.toString());

        d2.deleteFromHead();
        d2.deleteFromHead();
        d2.deleteFromHead();
        System.out.println(d2.toString());
        
        d2.addToTail("P");
        d2.addToTail("H");
        d2.addToTail("I");
        d2.addToTail("L");
        d2.addToTail("I");
        d2.addToTail("P");
        d2.addToTail("P");
        d2.addToTail("I");
        d2.addToTail("N");
        d2.addToTail("E");
        d2.addToTail("S");
        System.out.println(d2.toString());
        
        d2.deleteItems("H");
        System.out.println(d2.toString());
        d2.deleteItems("I");
        System.out.println(d2.toString());
        d2.deleteItems("P");
        System.out.println(d2.toString());
        d2.deleteItems("S");
        System.out.println(d2.toString());
        d2.deleteItems("X");
        System.out.println(d2.toString());
    }
    private DLLNode<T> head, tail;
    public DLL() 
    {

        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(T el) {
        head = new DLLNode(el, null, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void addToTail(T el) {
        if (isEmpty()) {
            head = tail = new DLLNode(el);
        } else {
            tail.next = new DLLNode(el, tail, null);
            tail = tail.next;
        }
    }

    public T deleteFromHead() {
        if (isEmpty()) {
            return null; //nothing to delete
        }
        T el = head.info;
        if (head == tail) {

            head = tail = null; // now empty list
        } else {

            head = head.next; // next node is head
            head.prev = null;
        }
        System.out.println(el);
        return el;
    }

    public T deleteFromTail() {
        if (isEmpty()) {
            return null;
        }

        T el = tail.info;

        if (head == tail) // only one node
        {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println(el);
        return el;
    }
    
    public void insertAfterNode(T el, DLLNode<T> ptr) {

        if (ptr != null) 
        {
            if (tail == ptr) 
            {
                addToTail(el);
            } else {
                ptr.next = new DLLNode<T>(el,ptr,null);
            }
        }

    }

   

    public String toString() {
        String x = "";
        for (DLLNode p = head; p != null; p = p.next) {
            x = x + p.info + " ";
        }
        return x;
    }

    public DLLNode getNode(T el) {
        DLLNode<T> p = head;

        while (p != null && ((Comparable) p.info).compareTo(el) != 0) {
            p = p.next;
        }

        return p;
    }

   public void insertAfterElt(T elOld,T elNew)
    {

        DLLNode p;

        p = getNode(elOld); // find node with el

        if (p != null) 
        {
            insertAfterNode(elNew, p); // found, insert after
        }
    }

   public T delete(T el) { // delete node with element el

        if (isEmpty()) {
            return null;
        }

        if (((Comparable) el).compareTo(head.info) == 0) {
            return deleteFromHead();
        }

        if (((Comparable) el).compareTo(tail.info) == 0) {
            return deleteFromTail();
        }

        DLLNode pred, t; // find el’s predecessor

        for (pred = head, t = head.next;t != null && ((Comparable) t.info).compareTo(el) != 0;
                pred = pred.next, t = t.next) ;

        if (t == null) {
            return null; // if el was not found
        } else {
            pred.next = t.next;

            return el;
        }
    }
   
    public int deleteItems(T el)
    {
        DLLNode pred,t;  // find el’s predecessor
        int count=0;
       for (pred = head, t = head.next;t != null ;
                pred = pred.next, t = t.next)
        {
            if (((Comparable) el).compareTo(head.info) == 0) {
            deleteFromHead();
            }
             
            if(((Comparable)pred.info).compareTo(el)==0)
            {
               pred.next=pred.next.next;  
            }
            
        }
        return count;
    }
    
}
