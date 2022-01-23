package Queues;
//Deque linked list representation --> Using Doubly Linked List;
public class Deque_LinkedList {
    Node front;
    Node rear;
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int val){
            this.val= val;
        }
    }
    // Inserting at the front end
    public void insertFirst(int val){
        Node node = new Node(val);
        if(front == null){
            front = node;
            rear=node;
            return;
        }
        node.next = front;
        node.prev =null;
        front.prev=node;
        front =node;
    }
    // Inserting at the rear end
    public void insertLast(int val){
        Node node = new Node(val);
        if(rear==null){
            front=rear=node;
            return;
        }
        node.next= null;
        node.prev=rear;
        rear.next=node;
        rear =node;
    }
    // deleting from the rear end
    public int deleteLast(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        int val = rear.val;
        if(front == rear){
            front = null;
            rear = null;
        }else {
            rear = rear.prev;
            rear.next = null;

        }
        return val;
    }
    // deleting from the front end
    public int deleteFirst(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        int val = front.val;
        if(front == rear){
            front = null;
            rear = null;
        }else {
            front = front.next;
            front.prev =null;
        }
        return val;
    }
    // Get front value
    public int getFirst(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        return front.val;
    }
    // Get rear value
    public int getLast(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        return rear.val;
    }
  // Isempty function to check whether the deque is empty or not
    private boolean isEmpty() {
        return front == null;
    }
    // Main Function
    public static void main(String[] args) {
        Deque_LinkedList dl = new Deque_LinkedList();
        dl.insertFirst(12);
        dl.insertLast(13);
        dl.insertFirst(14);
        dl.insertLast(15);
        dl.insertLast(133);
        System.out.println("Get the first element "+dl.getFirst());
        System.out.println("Get the Last element "+dl.getLast());
        System.out.println("Deleted Last element:"+ dl.deleteLast());
        System.out.println("Get the Last element "+dl.getLast());
        System.out.println("Deleted First element:"+ dl.deleteFirst());
        System.out.println("Get the first element "+dl.getFirst());


    }
}
