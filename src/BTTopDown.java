/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE #
 */


public class BTTopDown {
    
    static BST bst1 = new BST();
    public static void main(String arg[])
    {
        
        
        String ipapasok[]={"K","S","D","P","A","L","H","N","Q","M","J"};
        
        for(String x:ipapasok)
        {
            bst1.insert(x);
        }
        bst1.computeLevels();
        
        /*
        bst1.preorderIter();
        System.out.println("");
        bst1.inorderRecursive(bst1.root);
        System.out.println("");
        bst1.inorderIter();
        System.out.println("");
        bst1.postorderIter();
        System.out.println("");
        */
        
        System.out.println(bst1.toString());
        System.out.println("");
        
        //bst1.delete("H");
        //System.out.print(bst1.toString());
        System.out.println("");
        
        String ihahanap[]={"G","J","K","N","P","R","T"};
        for(String x: ihahanap)
        {
           search(x);
        }
        
        findLCA("A","Z");
        findLCA("A","Q");
        findLCA("Q","A");
        findLCA("M","Q");
        findLCA("Q","M");
        findLCA("S","N");
        findLCA("L","G");
        
        
    }
   
    public static void findLCA(String x, String y)
    {
        System.out.println("KEYS: "+x+" "+y);
        System.out.println("LCA :");
        if(bst1.search(x)!=null&&bst1.search(y)!=null)
        {
            System.out.println(bst1.findLCA(bst1.search(x).key,bst1.search(y).key).key);
            System.out.println(bst1.findLCA(bst1.search(x).key,bst1.search(y).key).toString());
        }
        else
        {
            System.out.println("NO COMMON ANCESTOR");
        }
        System.out.println(" ");
        
    }
    public static void search(String x)
    {
         if(bst1.search(x)!=null)
            {
               
                System.out.println("KEY "+x);
                System.out.println("LEVEL:"+bst1.search(x).level);
                System.out.println("["+bst1.search(x).toString());
                
                System.out.println("");
            }
            else
            {
                System.out.println("THE KEY "+x+" is not found");
                System.out.println("");
            }
    }
    
    

}
