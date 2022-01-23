package Trees;
// Inorder traversal without recursion using stack
import java.util.Stack;

public class Traversal {
    // Node class
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    Node root;
   // inorder traversal
   void inorder(){
       if(root == null) return;
       Stack<Node> s = new Stack<>();
       Node curr = root;
       while (curr!=null || s.size()>0){
           while (curr!=null){
               s.push(curr);
               curr = curr.left;
           }
           curr=s.pop();
           System.out.print(curr.data+" ");
           curr = curr.right;
       }
   }
   // preorder Traversal
    void preorder(){
       if(root == null ) return;
       Stack<Node> str = new Stack<>();
       Node curr = root;
       while (curr!=null || str.size()>0){
           while (curr!=null){
               System.out.print(curr.data+" ");
               str.push(curr);
               curr = curr.left;
           }
           curr = str.pop();
           curr = curr.right;
       }
    }
    // Main function
    public static void main(String[] args) {
        Traversal tree = new Traversal();
        tree.root =new Node(1);
        tree.root.left = new Node(2);
        tree.root.right =new Node(3);
        tree.inorder();
        tree.preorder();
    }

}

