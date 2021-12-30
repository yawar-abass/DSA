package LinkedList;

public class DLL {
     private Node head;
     private Node tail;
     private int size;
       DLL(){
           this.size =0;
       }

    public int getSize() {
        return size;
    }

    //Insertion
    public void insertFirst(int val) {
        Node node = new Node(val);
        size += 1;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }
    // Inserting at last
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp = temp.next;
        }
        node.next =null;
        temp.next = node;
        node.prev = temp;
        tail = node;
        size +=1;
    }
    //Inserting at a particular index
    public void insertIdx(int val, int index){
           if(index<0){
               System.out.println("Negative index ");
               return;
           }
           if(index==0){
               insertFirst(val);
               return;
           }
           if(index==size){
               insertLast(val);
           }
           Node temp = head;
           for(int i=0;i<index-1;i++){
               temp = temp.next;
           }
           Node node = new Node(val);
           node.next =temp.next;
           temp.next =node;
           node.prev =temp;
           if(node.next!=null){
               node.next.prev=node;
           }
            size+=1;
    }
    // Reverse a linked list
    public void reverse(){
           Node temp = tail;
           while (temp!=null){
               System.out.println(temp.val + "-->");
               temp = temp.prev;
           }
    }

    //Display
    public void display(){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.val + " -->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // creating Node
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next, Node prev){
            this.val = val;
            this.next =next;
            this.prev = prev;
        }
    }
}
