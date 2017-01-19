
/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE #
 */
import java.util.Scanner;

public class QueueSieve {

    public static void main(String args[]) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("INPUT NUMBER");
        int n = Integer.parseInt(sc.nextLine());

        //pagenqueue
        for (int z = 2; z < n; z++) {
            q.enqueue(z);
        }
        
        //temp na queue
        Queue temp = new Queue();
        


        while (!q.isEmpty()) 
        {
            
            //unang dequeue ay p.
            int p = Integer.parseInt(q.dequeue().toString());
            //piprint ang nadequeue
            System.out.print(p+" ");
            
          
            while (!q.isEmpty()) 
            {
                int nadequeue = Integer.parseInt(q.dequeue().toString());
                
                if (nadequeue % p != 0) 
                {
                    //kung hindi siya divisible tsaka ilalagay muna sa temp na queue
                    temp.enqueue(nadequeue);
                }
            }
            while(!temp.isEmpty())
            {
                //ibabalik na sa original na queue
                q.enqueue(temp.dequeue());
            }
            
        }
    }
}
