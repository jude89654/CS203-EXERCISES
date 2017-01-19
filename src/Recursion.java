/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author JUDE
 */

public class Recursion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int t= Integer.parseInt(JOptionPane.showInputDialog("PLEASE INPUT VALUE OF T"));
        
        
        if (t==1)
        {
            String s=JOptionPane.showInputDialog("PLEASE INPUT PHRASE"); 
            String words[]= s.split(" ");
            
            for (String x: words)
            {
                System.out.println(x);
            }
            
            //pagreverse ng array
            Reverse(0,words.length-1, words);
            
           //printing
           System.out.println("The reversal is");
           for (String x: words)
            {
                System.out.println(x);
            }
        }
        else if(t==2)
        {
            String s = JOptionPane.showInputDialog("PLEASE INPUT WORD");
            //pagprint 
            for(int z=0; z<=s.length()-1; z++)
            {
                System.out.println(s.charAt(z));
            }
            //pagcheck ng palindrome
            isPalindrome(0,s.length()-1,s);
                    
            
        
        }
        else if(t==3)
        {}
        else if(t==4)
        {}
        
        
    }
     public static void Reverse(int una, int huli, String array[])
    {
       if (una>=huli)
       {
       } 
       else {
           String muna = array[una];
           array[una]= array [huli];
           array[huli]= muna;
           Reverse(una+1, huli-1, array);
        }
    }
    public static void isPalindrome(int una, int huli, String salita)
    {
        char x=salita.charAt(una);
        char y=salita.charAt(huli);
        if(una<=huli)
        {
            if(x==y)//pagparehas uulit ang recursion
            {
                isPalindrome(una+1,huli-1,salita);
            }
            else
            {
               System.out.println("is not a palindrome");
            }
        }  
        else//pag nagkita na sa gitna, naprove na palindrome
        {
            System.out.println("is a palindrome");
        }
        
        
    }
    
}

