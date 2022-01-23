package Queues;
// Linked List Representation
public class Circular_Queue_LL {
        Node front;
        Node rear;
        class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
            }
        }
        public void insert(int val){
            Node node = new Node(val);
            if(front == null){
                front =node;
                rear = node;
                rear.next= front;
                return;
            }
            node.next =front;
            rear.next =node;
            rear =node;
        }
        public int delete(){
            if(front == null){
                System.out.println("List is empty");
                return -1;
            }
            int val = front.val;
            if(front == rear){
                front =null;
                rear =null;
                return val;
            }
            front = front.next;
            rear.next = front;
            return val;
        }
        // Display function
        public void display(){
            Node temp = front;
            while (temp!=rear){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.print(rear.val+" ");
            System.out.println();
        }

    public static void main(String[] args) {
        Circular_Queue_LL lr = new Circular_Queue_LL();
        lr.insert(12);
        lr.insert(13);
        lr.insert(14);
        lr.insert(15);
        lr.display();
        lr.delete();
        lr.display();
        lr.insert(12);
        lr.display();
    }

}
