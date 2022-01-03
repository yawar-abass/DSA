package Queues;
// Implementation of queue in Linked list;
public class Queue_LinkedList {
    Node front;
    Node rear;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public void enque(int val){ // Inserting the value in Linked list
        Node node = new Node(val);// create a new node
        System.out.println("Inserted : " +val);
        if(front == null){ // first node of Linked list
            front = node;
            rear = node;
            return;
        }
        node.next =null;// because rear.next is pointing  null
        rear.next = node; // now point the rear node to the new node
        rear = node; // our new node is now rear node(last node)
          }
    public int deque(){ // Deletion of the node
        if(front == null){
            System.out.println("Queue is empty ");
            return -1;
        }
        int val = front.val;
        System.out.println("Deleted :" +val);
        if(front == rear){
            front = null;
            rear =null;
            return val;
        }
        front = front.next;
        return val;
    }
    public void display(){
        if(front == null){
            System.out.println("Queue is Empty now");
            return;
        }
        Node temp = front;
        System.out.print("Queue is --> ");
         while (temp!=rear){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print(rear.val+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue_LinkedList ql = new Queue_LinkedList();
        ql.enque(12);
        ql.enque(13);
        ql.enque(14);
        ql.display();
        ql.deque();
        ql.deque();
        ql.deque();
        ql.display();
    }
}
