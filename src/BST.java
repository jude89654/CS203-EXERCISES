/*
 * JUDE ARDYN C. BISMONTE
 * 2CSC-4 
 * LAB EXERCISE #
 */

public class BST extends BT {

    public BTNode search(String k) {
        BTNode node = root;

        while (node != null) {
            if (k.compareTo(node.key) == 0) {
                return node;
            } else {
                if (k.compareTo(node.key) < 0) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return null;
    }

    public void insert(String k) {
        if (root == null) {
            root = new BTNode(k);return;
        }

        BTNode node = root, marcher = null;

        while (node != null) {
            marcher = node;

            if (k.compareTo(node.key) < 0) 
            {
                node = node.left;
            } else {
                node = node.right;
            }

        }

        if (k.compareTo(marcher.key) < 0) {
            marcher.left = new BTNode(k);
        } else {
            marcher.right = new BTNode(k);
        }
    }

    public BTNode findLCA(String a, String b) {

        BTNode kunyaringRoot = root;

        if (search(a) != null && search(b) != null) {
            BTNode A = search(a);
            BTNode B = search(b);

            if (kunyaringRoot == null) {

                return null;
            }
            while (kunyaringRoot != null) {
                if (kunyaringRoot.key.equals(A.key) || kunyaringRoot.key.equals(B.key)) {
                    return kunyaringRoot;
                } else if (kunyaringRoot.key.compareTo(A.key) > 0 && kunyaringRoot.key.compareTo(B.key) < 0 || kunyaringRoot.key.compareTo(A.key) < 0 && kunyaringRoot.key.compareTo(B.key) > 0) {
                    return kunyaringRoot;
                } else if (kunyaringRoot.key.compareTo(A.key) > 0 && kunyaringRoot.key.compareTo(B.key) > 0) {
                    kunyaringRoot = kunyaringRoot.left;
                } else if (kunyaringRoot.key.compareTo(A.key) < 0 && kunyaringRoot.key.compareTo(B.key) < 0) {
                    kunyaringRoot = kunyaringRoot.right;
                } else {
                    break;
                }

            }

            return kunyaringRoot;
        } else {
            return null;
        }

    }
    
    
    public boolean delete(String pinapabura) 
    {
            if(search(pinapabura)!=null)
            {
                BTNode nodeNaPinapabura=search(pinapabura);
                if (root == null)
                    return false;
                else {
                    if (root.getKey().equals(pinapabura)) 
                    {
                        BTNode gayaGayangNode = new BTNode(null);
                        gayaGayangNode.left=root;
                        boolean result = root.delete(pinapabura, gayaGayangNode);
                        root = gayaGayangNode.left;
                        return result;
                    } else {
                        return root.delete(pinapabura, null);
               }
                }
            }
            else
            {
                return false;
            }
      }

    
}
