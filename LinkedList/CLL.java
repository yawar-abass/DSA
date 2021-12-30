package LinkedList;

public class CLL {
    private  Node head;
    private Node tail;
    private  int size;
    CLL(){
        this.size=0;
    }
    // Insertion
    public void insert(int val){
        Node node = new Node(val);
        size=+1;
        if(head == null){
            head= node;
            tail =node;
        }
        tail.next= node;
        node.next= head;
        tail =node;
    }
    // Insert at a particular index
    public void insertIdx(int val ,int index){
        Node node = new Node(val);
        if(index==0){
            head =node;
            tail= node;
            return;
        }
        Node temp = head;
        for (int i = 0; i <index-1; i++) {
            temp= temp.next;
             }
        node.next= temp.next;
        temp.next=node;
        if(node.next==head){
            tail=node;
        }
    }
    //Deletion
    public void delete(int val){
        size--;
        if(head.val == val){
            head= head.next;
            tail.next =head;
        }
        Node node = head;
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
            }
            node = node.next;
        }while (node!=head);

    }
    // Display
    public void display(){
        Node temp = head;
        if(head!=null) {
            do {
                System.out.print(temp.val + " -->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }
    // create a node
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
}
