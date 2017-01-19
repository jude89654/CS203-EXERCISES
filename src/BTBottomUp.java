/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE 8
 */

public class BTBottomUp {

    public static void main(String args[])
    {
        BTNode x2= new BTNode("2");
        
        BTNode x4= new BTNode("4");
        BTNode x1= new BTNode("1",null,x2);
        BTNode x5= new BTNode("5",x4,null);
        BTNode x3= new BTNode("3",x1,x5);
        
        BT tree = new BT();
        
        tree.setRoot(x3);
        
        System.out.println("");
        
        tree.computeLevels();
        
        System.out.print(tree.toString()+" "+tree.bottomLeavesCount());
        
        /*
         *  BTNode E = new BTNode("E");
        BTNode G = new BTNode("G");
        BTNode D = new BTNode("D");
        BTNode L = new BTNode("L",G,D);
        BTNode F = new BTNode("F");
        BTNode B = new BTNode("B",E,null);
        BTNode A = new BTNode("A",null,L);
        BTNode H = new BTNode("H",B,F);
        BTNode K = new BTNode("K",A,null);
        BTNode C = new BTNode("C",null,H);
        BTNode S = new BTNode("S",C,K);
        BT tree2 = new BT();
        tree2.setRoot(S);
        System.out.println("");
        tree2.computeLevels();
        System.out.print(tree2.toString());

         */
    }
}
