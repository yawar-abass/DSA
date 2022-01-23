package Queues;

public class Priority_Queue {
    Node front;
    Node rear;
    private class Node {
       private int val;
       private int prior;
       private Node next;
        Node(int val, int prior){
            this.val= val;
            this.prior = prior;
        }
    }
    //Function to insert a new Node
    public void insert(int val ,int prior){
        Node node = new Node(val,prior);
        if(isEmpty()){// Inserting the first node
            front = node;
            rear =node;
            return;
        }
        if(node.prior > rear.prior){ //If the priority of current node is greater than the rear(last) node
            node.next = null; // insert the node at the last.
            rear.next = node;
            rear = node;
            return;
        }
        else{ // If the current node has priority between the LL .
            Node temp = front; // temp will go till the priority is grater than the current node.
            while (temp.next!=null && temp.next.prior<node.prior){ // Go till the prev (node) of temp
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
           }
    }
    // Getting the highest priority element
    public int getHighestPriority(){
        if(isEmpty()){
            return -1;
        }
        return rear.val; // because the highest priority has the rear node;
    }
    private boolean isEmpty() {
        return front == null;
    }
    // Deleting the highest priority node;
    public int deleteHighestPriority(){
        if (isEmpty()){
            return -1;
        }
        Node temp = front;
        while (temp.next!= rear){ // go till the previous node of highest priority(rear)
            temp = temp.next;
        }
        rear = temp; // new rear is now temp
        int delete = temp.next.val;// store the value of actual rear (highest priority)
        temp.next =null;
        return delete;
    }
     // Deleting the Lowest priority node;
    public int deleteLowestPriority(){
        if(isEmpty()){
            return -1;
        }
        int val = front.val;
        if(front == rear){
            front=null;
            rear =null;
            return val;
        }
        front = front.next;
        return val;
    }
    // Display function
    public void display(){
        if(isEmpty()){
            return;
        }
        Node temp = front;
        while (temp!= rear){
            System.out.print("V ="+ temp.val+" P: "+ temp.prior+" ");
            temp = temp.next;
        }
        System.out.print("V = "+rear.val+" P: "+rear.prior+"\n");
    }
// main function
    public static void main(String[] args) {
        Priority_Queue pq = new Priority_Queue();
        pq.insert(10,1);
        pq.insert(11,4);
        pq.insert(9,2);
        pq.insert(122,3);
        pq.display();
//        pq. deleteLowestPriority();
//        pq. deleteLowestPriority();
        System.out.println(" Get Highest priority element =" +pq.getHighestPriority());
        System.out.println("Deleting the Highest priority element =" +pq.deleteHighestPriority());
        pq.display();
    }
}


