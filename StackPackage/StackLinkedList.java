package StackPackage;

public class StackLinkedList {
         Node root;
        class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
        public boolean isEmpty(){ return root ==null;}
        public void push(int val){
            Node node = new Node(val);
            if(root==null){
                root =node;
                return;
            }
            node.next = root;
            root = node;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return -1;
            }
            int val = root.val;
            if(root.next==null){
                root =null;
                return val;
            }
            root = root.next;
            return val;
        }
        public void display(){
            Node temp = root;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        public static void main(String args[]){
            StackLinkedList list = new StackLinkedList();
            list.push(12);
            list.push(13);
            list.push(14);
            list.display();
            list.pop();
            list.display();
        }

}
