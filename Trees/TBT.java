package Trees;
// Threaded Binary Tree
public class TBT {

    static class Node{
        int val;
        Node left, right;
        boolean rThread , lThread;
        Node(int val){
            this.val= val;

        }
    }
    Node root;
    //Insertion
    public Node insert(Node root, int key){
        Node cur = root;
        Node pra = null;
        while (cur!=null){
            if (key == (cur.val)){
                System.out.println("Duplicate element found");
                return cur;
            }
            pra = cur;
            if(key<cur.val){
                if(!cur.lThread){
                    cur = cur.left;
                }
                else
                    break;
            }
            else{
                if(!cur.rThread){
                    cur = cur.right;
                }
                else
                    break;
            }
        }
        Node node = new Node(key);
       node.rThread = node.lThread = true;
        if(pra == null){
            root = node;
            root.left = null;
            root.right= null;
            }
        else if(key<pra.val){
            node.left =  pra.left;
            node.right = pra;
            pra.lThread = false;
            pra.left =node;
        }
        else {
            node.right = pra.right;
            node.left = pra;
            pra.rThread = false;
            pra.right = node;
        }
        return root;
    }
    public void insert(int val){
        root = insert(root, val);
    }
    // Deletion in TBT
    public Node delete(Node root, int val){
        if(root == null) return null;
        Node par = null;
        Node curr = root;
        int found =0;
        while (curr!=null){
            if(curr.val== val){
                found =1;
                break;
            }
            par = curr;
            if(val<curr.val){
                if(!curr.lThread){
                    curr = curr.left;
                }
                else {
                    break;
                }
            }
            else {
                if(!curr.rThread){
                    curr = curr.right;
                }else
                    break;
            }
        }
        if(found == 0) {
            System.out.println("Value not found");
        }
        // Two Children
        else if(!curr.lThread && !curr.rThread){
         root = caseC(root,par, curr);
        }
        // One child on right side
        else if(!curr.rThread){
            root = caseB(root, par,curr);
        }
        // one child on left side
        else if(!curr.lThread){
            root = caseB(root,par, curr);
        }
        // leaf node
        else{
            root = caseA(root,par, curr);
        }
        return root;
    }
    // If the Node is Leaf node (Threaded Node)
    public Node caseA(Node root, Node par, Node cur){
        if(par==null){
            root =null;
        }
        else if(par.left == cur){
            par.left = cur.left;
            par.lThread =true;
        }
        else {
            par.right = cur.right;
            par.rThread = true;
        }
     return  root;
    }
    // If the Node has only one Child
    public Node caseB(Node root, Node par, Node cur){
        Node child; // Node after the current Node
        if(!cur.lThread){
            child = cur.left;
        }
        else  {
            child = cur.right;
        }
        if(par == null){
            root =child;
        }
        else if(par.right==cur){
            par.right =child;
        }
        else if(par.left == cur){
            par.left = child;
        }
        Node p = inorderPre(cur);
        Node s = inorderSuc(cur);
        if(!cur.lThread){
            p.right = s;
        }
        else if(!cur.rThread){
            s.left = p;
        }
        return root;
    }
    // Case C for Two child node
    public Node caseC(Node root, Node par, Node cur){
        Node parsuc = cur;
        Node succ = cur.right;
        while (!succ.lThread){
            parsuc =succ;
            succ = succ.left;
        }
        cur.val = succ.val;
        if(succ.lThread && succ.rThread ){
            root = caseA(root,parsuc, succ );
        }
        else {
            root = caseB(root, parsuc, succ);
        }
        return root;
    }
    public void delete(int val){
        root = delete(root,val);
    }
    // Inorder Successor
    public Node inorderSuc(Node root){
        Node cur = root;
        if(cur.rThread){ // If it is a thread node with right thread (rThread should be true) pointing to its successor
            return root.right; // return the that successor
        }
        cur =  cur.right;// Go towards the right of node
        while (!cur.lThread){ // Go left until the node reaches the left thread node (lThread is true) i.e --> the successor of current node;
            cur = cur.left;
        }
        return cur;
    }
    // Inorder Predecessor
    public Node inorderPre(Node root){
        Node cur = root;
        if(cur.lThread){
            return cur.left;
        }
        cur = cur.left;
        while (!cur.rThread){
            cur = cur.right;
        }
        return cur;
    }
    // print Inorder
    public void inorderPrint(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return;
        }
        Node curr = root;
        while (!curr.lThread){ // Go till the left threaded node(lThread true for that node) , Last left node of tree
            curr = curr.left;
        }
        while (curr!=null){ // Go till the last right most node i.e -->null
            System.out.print(curr.val+" ");
            curr = inorderSuc(curr); // Get the next inorder Successor of the current node
        }
    }
    // Driver Program
    public static void main(String[] args)
    {
//        Node root = null;
//
//        root = insert(root, 20);
//        root = insert(root, 10);
//        root = insert(root, 30);
//        root = insert(root, 5);
//        root = insert(root, 16);
//        root = insert(root, 14);
//        root = insert(root, 17);
//        root = insert(root, 13);
          TBT tree = new TBT();
          tree.insert(10);
          tree.insert(30);
          tree.insert(40);
          tree.insert(5);
          tree.insert(1);
          tree.inorderPrint(tree.root);
          tree.delete(5);
        System.out.println();
          tree.inorderPrint(tree.root);

    }

}
