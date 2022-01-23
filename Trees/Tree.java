package Trees;
import java.util.*;
public class Tree {
    Node root;
      // Create a tree and input data for tree
    //    static Scanner sc = null;
//     public static Node createTree(){
//         Node root;
//         System.out.println("Enter the data: ");
//         int data = sc.nextInt();
//         if(data == -1) return null;
//         root =new Node(data);
//         System.out.println("Enter for Left: " +data);
//         root.left =createTree();
//         System.out.println("Enter for Right: "+data);
//         root.right =createTree();
//         return root;
//         }
    // Inorder Traversal --> L P R (Left print right)
       public  void inorder(Node root){
         if(root==null) return;
         inorder(root.left);
           System.out.print(root.val+" ");
           inorder(root.right);
       }
       // preorder Traversal --> P L R
       public void preorder(Node root){
         if (root == null) return;
           System.out.print(root.val+" ");
           preorder(root.left);
           preorder(root.right);
       }
       // Postorder traversal --> L R P
       public void postorder(Node root){
         if(root == null) return;
         postorder(root.left);
         postorder(root.right);
           System.out.print(root.val+" ");
       }
       // Level-Order Traversal
       public void leveOrder(){
           Queue<Node> q = new LinkedList<>();
           q.add(root);
           while (!q.isEmpty() ){
               Node curr = q.poll();
               System.out.print(curr.val+" ");
               if(curr.left!=null)
                   q.add(curr.left);
               if(curr.right!=null)
                   q.add(curr.right);
           }
       }
       // Main function
    public static void main(String[] args) {
//           sc = new Scanner(System.in);
//           createTree();
        Tree tre = new Tree();
        tre.root = new Node(1);
        tre.root.left =new Node(2);
        tre.root.right =new Node(3);
        tre.root.left.left = new Node(4);
        tre.root.left.right = new Node(5);
        System.out.println("Inorder Traversal ");
        tre.inorder(tre.root);
        System.out.println("\nPreorder Traversal");
        tre.preorder(tre.root);
        System.out.println("\nPostorder Traversal");
        tre.postorder(tre.root);
        System.out.println("\nLevel Order Traversal");
        tre.leveOrder();
    }
}
 class Node{
    int val;
    Node right, left;
    public Node(int val){
        this.val = val;
        right = left = null;
    }
}
