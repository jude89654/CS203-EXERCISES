
public class Queue <T> {

    private int front, rear;
    public final static int queueMax=100;// max number of elements

    private Object[] que; //Elements must be cast back.

    public Queue()
    { // constructor
        que = new Object[queueMax]; // at most queueMax elements
        clear();
    }
   
    public void clear()
    {                 
        front=rear=-1;
    }
    
    public T peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
        return (T)que[front];
        }
    }
    
     public T rear()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
        return (T)que[rear];
        }
    }
     
    public boolean isFull()
    {
        return(((rear+1) % queueMax)== front);
    }
    
    public void enqueue(Object el)
    {
        if(isFull())
        {
            System.out.println("Enqueue Overflow Error");
        }
        else
        {
            rear=(rear+1)%queueMax;
            que[rear]=el;
            if (front==-1)
            {
                front = 0;
            }
        }
    }
    
    public boolean isEmpty()
    {
        return(front==-1);
    }
    
    public T dequeue()
    {
        if (isEmpty())
        {
            System.out.println("dequeue underflow error");
            return null;
        }
        else
        {
            T deqElt= (T) que[front];
            if (front == rear)
            {
                clear();
            }
            else
            {
                front = ((front+1)%queueMax);
                
            }
            return (T) deqElt;
        }
        
    }
}