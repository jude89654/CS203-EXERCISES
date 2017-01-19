/**
 *JUDE ARDYN C. BISMONTE
 * 2CSC-4
 * LAB EXERCISE 8
 */

import java.util.Scanner;

public class QueueJosephUs {
    public static void main(String args[])
    {
        
        
        Scanner scandal= new Scanner(System.in);
        Queue<String> pila= new Queue();
        
        String alphabet[]={"A","B","C","D","E","F",
            "G","H","I","J","K","L","M","N","O","P","Q"
                ,"R","S","T","U","V","W","X","Y","Z"};
        
        
        
        System.out.println("T=");
        int t= Integer.parseInt(scandal.nextLine());
        
        switch(t)
        {
            case 1:
            {
                //paginput
                System.out.println("s=");
                int s= Integer.parseInt(scandal.nextLine());
                System.out.println("n=");
                
                int mgaBata=Integer.parseInt(scandal.nextLine());
                //paglagay at pagprint sa queue ng mga letters
                System.out.println("CHILDREN");
                for(int coconut=0;coconut<mgaBata;coconut++)
                { 
                    System.out.print(alphabet[coconut]+" ");
                    pila.enqueue(alphabet[coconut]);
                }
                System.out.println("");
               
                
                
                
                String bata="";
                
                String eliminationOrder="";
                //uulitulitin ang laro habang mawala lahat ng bata
                while(!pila.isEmpty())
                {
                       
                    //pagqueue and dequeue habang umabot sa syllables
                    for(int kanta=1;kanta<=s;kanta++)
                    {
                       bata = pila.dequeue();
                       if(kanta<s)pila.enqueue(bata);//pag umabot na sa last syllable hindi na siya ieenqueue
                    }
                    eliminationOrder+= bata+" ";//pagdugtong ng string ng mga natanggal ang bata
                  
                }
                
                System.out.println("ELIMINATION ORDER "+eliminationOrder);
                break;
            }
            case 2:
                break;
            case 3:
                break;
        }
    }
    
}
