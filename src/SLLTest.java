


import javax.swing.JOptionPane;

public class SLLTest 
{
    public static void main(String args[])
    {
        int t =Integer.parseInt( JOptionPane.showInputDialog("PLEASE input t"));
        
        if (t==1)
        {
            String mgaNumbers=JOptionPane.showInputDialog("PLEASE INPUT A LIST OF NUMBERS");
            String hiwalay[]= mgaNumbers.split(" ");
            int hiwalayNaNumbers[]=new int[hiwalay.length];
            int w=0;
            System.out.println("Strings in the array");
            for(String x: hiwalay)
            {
                hiwalayNaNumbers[w]=Integer.parseInt(x);
                w++;
                System.out.println(x);
            }
            SLL noodles= new SLL();
            
            System.out.println("linked LIST CONTENTS");
            for(int z:hiwalayNaNumbers)
            {
                noodles.insertAsc(z);
                System.out.println(noodles.toString());
            }
        }
        else
        {}
            
            
           
            
            
            
    }
}