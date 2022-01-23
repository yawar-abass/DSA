package Sorting;

public class SortLL {
    Node head;
    static class  Node{
        int val;
        Node next;
        Node(int val){
           val = this.val;
        }
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null) {
            head = node;
            return;
        }
        Node temp= head;
        while (temp.next!=null){
            temp = temp.next;
        }
        node.next = null;
        temp.next = node;            
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SortLL list = new SortLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
    }
}
