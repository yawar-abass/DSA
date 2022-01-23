package Trees;

import javax.print.DocFlavor;

public class BST {
    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int key){
            this.key= key;
            left=right=null;
        }
    }
    Node root;
    // Searching with recursion
    public Node search(Node root,int val) {
        if (root == null) return null;
        if (root.key == val) return root;
        if (val > root.key) {
            return search(root.right, val);
        }
        return search(root.left, val);
    }
    // traversal Inorder
    public void traverse(Node root){
        if (root != null) {
            traverse(root.left);
            System.out.print(root.key + " -> ");
            traverse(root.right);
        }
    }
    //Insertion Using Recursion
    public Node insertRec(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val> root.key) {
          root.right =  insertRec(root.right,val);
        }
        if(val< root.key){
          root.left =  insertRec(root.left,val);
        }
        return root;
    }
    // Insertion using loop
    public void add(Node root, int val){
        Node node = new Node(val);
        if(root == null){
            root = node;
            return;
        }
        Node prev = null;
        Node curr = root;
        while (curr!=null){
            if(val>curr.key){
                prev = curr;
                curr = curr.right;
            }
            else if(val<curr.key){
                prev =curr;
                curr = curr.left;
            }
        }
        if(val> prev.key)
            prev.right =node;
        else
            prev.left = node;
    }
    void insert(int key) {
        root = insertRec(root, key);
    }
    //Deletion by merging
    public Node delete(Node root, int key){
           if(root==null) return root;
           if(root.key == key) {
               return helper(root);
           }
           Node temp = root;
           while (temp!=null){
               if(key<temp.key){
                   if(temp.left!=null && temp.left.key==key){
                       temp.left = helper(temp.left);
                       break;
                   }
                   else{
                       temp = temp.left;
                   }
               }
               else{
                  if (temp.right!=null && temp.right.key == key){
                      temp.right = helper(temp.right);
                      break;
                  }
                  else {
                      temp = temp.right;
                  }
               }
           }
        return root;
    }

    private Node helper(Node root) {
         if(root.left==null) return root.right;
          else if (root.right == null) return root.left;
          else{
              Node rightChild = root.right;
              Node lastRight  = findlastRight(root.left);
              lastRight.right = rightChild;
              return root.left;
         }
    }

    private Node findlastRight(Node root){
        if (root == null){
            return root;
        }
        return findlastRight(root.right);
    }

    // Deletion using coping and recursion
    public Node deleteRec(Node root, int key){
        if(root == null) return root;
        if(key>root.key) {
           root.right = deleteRec(root.right, key);
        }
        else if(key< root.key){
            root.left =deleteRec(root.left, key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null ){
                return root.left;
            }
            root.key = minValue(root.right);
           root.right= deleteRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node root) {
           int minv= root.key;
           while (root.left!=null){
               minv = root.left.key;
               root = root.left;
           }
           return minv;
    }
    void deleteKey(int val) {
        root = deleteRec(root, val);
    }
    //check If a tree is a BST or not{
    public boolean validBST(Node root){
        return hel( root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean hel(Node root, long minValue, long maxValue) {
        if(root == null) return true;
        if(root.key>maxValue || root.key < minValue) return false;
        return hel(root.left,minValue,root.key) && hel(root.right,root.key,maxValue);
    }
    // count the non-leaf Nodes in BST
    public int countInter(Node root){
        if(root == null || root.left == null && root.right == null) return 0;
        return 1+ (countInter(root.left)+countInter(root.right));
    }
     // count the leaf nodes in BST
    public int countLeaf(Node root){
        if(root == null || root.left == null && root.right == null) return 1;
        return countLeaf(root.left)+countLeaf(root.right);
    }
    //Height of Tree
    public int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }
    // Main method
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(100);
        tree.insert(19);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(5);
        tree.insert(13);
        tree.insert(11);
        tree.insert(200);
        tree.insert(111);
        tree.insert(209);
//        tree.insert(tree.root, 10);
//        tree.deleteRec(tree.root, 8);
        System.out.println(tree.countLeaf(tree.root));
        System.out.println(tree.height(tree.root));
//        tree.traverse(tree.root);
    }
}
