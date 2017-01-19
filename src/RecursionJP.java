
import java.util.Scanner;

/*
 * JOHN PATRICK GARCIA
 * 2CS -
 * LAB EXERCISE 2
 */


public class RecursionJP {
   static String word;
    public static void main (String args[])
    {
        //prints full name
        System.out.println("PANGALAN MO");
        //scanner class
        Scanner scanner= new Scanner(System.in);
        
    
       
        System.out.println("t=");
        int t=Integer.parseInt(scanner.nextLine());
        
      
        System.out.println("s=");

        String s= scanner.nextLine();
      
        word =s;
        
    
        for(int z=0; z<word.length()-1;z++)
        {
            System.out.println(word.charAt(z));
        }
    
        
        switch(t)
        {
            case 1: 
              
            
           
            if(isPalindrome(0,word.length()-1,word))
            {
                //duhhh
                System.out.println("IS A PALINDROME");
            }
            else
            {
                //duhhhhh
                System.out.println("IS NOT A PALINDROME");
            }
              
                
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            default: 
                break;
        }
        
    }
    
    
    public static boolean isPalindrome(int firstLetter,int lastLetter,String word)
    {
        
        if(firstLetter>=lastLetter)
        {
           return true;
        }
        else
        {
           
            if((""+word.charAt(firstLetter)).compareTo(""+word.charAt(lastLetter))==0)
            {
                
                return isPalindrome(firstLetter+1,lastLetter-1,word);
            }
            else
            {
                return false;
            }
        }
        
    }

}
