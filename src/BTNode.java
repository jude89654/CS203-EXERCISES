/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4
 * LAB EXERCISE 8
 */

public class BTNode extends Object {

    protected String key;
    protected BTNode left, right;
    protected int level;

    public BTNode() {
        key = "";
        left = right = null;
    }

    public BTNode(String i) {
        this(i, null, null);
    }

    public BTNode(String i, BTNode l, BTNode r) {
        key = i;
        left = l;
        right = r;
    }

    public String getKey() {
        return key;
    }

    public String toString()
    {
        String detalye="";
        if(!key.equals(""))
        {
            
            detalye+="K="+key;
            if(left!=null)
            
            {
               detalye+=" L=["+left.toString()+"]";
            }
        
                if (right!=null)
            {
                detalye+=" R=["+right.toString()+"]";
            }
        }
        if(left==null && right==null)
        {
            detalye+="]";
        }
        
        return detalye;
}
    
    
    

    public boolean delete(String pinapabura, BTNode parent) 
    {
            if (pinapabura.compareTo(key)<0) {
                  if (left != null)
                        return left.delete(pinapabura, this);
                  else
                        return false;
            } 
            else if (pinapabura.compareTo(key)>0) 
            {
                  if (right != null)
                        return right.delete(pinapabura, this);
                  else
                        return false;
            } 
            else 
            {
                  if (left != null && right != null) 
                  {
                        key = left.maxValue();
                        left.delete(key, this);
                  } 
                  else if (parent.left == this) 
                  {
                        parent.left = (left != null) ? left : right;
                  } else if (parent.right == this) {
                        parent.right = (left != null) ? left : right;
                  }
                  return true;
            }
      }
     public String maxValue() {
            if (right == null)
                  return key;
            else
                  return right.maxValue();
      }
    
}