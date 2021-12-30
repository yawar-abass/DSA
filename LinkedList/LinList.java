package LinkedList;

public class LinList<E> {
    private Node head;
    private Node tail;
    private int size;
    LinList(){
        size=0;
    }
    // Create Node
    class Node{
         E val;
         Node next;
         Node(E val){
             this.val= val;
         }
         Node(E val, Node next){
             this.val = val;
             this.next = next;
         }
     }

    public int getSize() {
        return size;
    }

    //      Inserting  element at first in Linked list
    public void insertFirst(E val){
        Node node = new Node(val);
        size+=1;
        if(head==null){
            head=node;
            tail= head;
            return;
        }
        node.next = head;
        head = node;
    }
    // Inserting element at the last of LL
    public  void insertLast(E val){
        Node node = new Node(val);
        size++;
        if(head==null){
            head=node;
            tail= head;
            return;
        }
        tail.next=node;
        tail=node;
    }
    // Insert at a particular index
    public void insertIdx(E val,int index){

        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size-1){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp= temp.next;
          }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }
    //Deletion in LL
    // Delete from Head
    public void deleteFirst(){
        if(head==null){
            System.out.println();
        }

        head = head.next;
        size--;

    }
    // Delete from last
    public void deleteLast(){
        if(head==null){
            System.out.println("No element in linked list");

        }
        Node temp=head;
        for (int i = 0; i <size-2 ; i++) {
            temp=temp.next;
        }

        tail = temp;
        tail.next=null;
        size-=1;

    }
    //Deleting at a particular index
    public void deleteIdx(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp= head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size-=1;

    }
    // Reversing a linked list
    public void reverse(){
        if(head==null||head.next==null) return;
        Node prev = null;
        Node curr = head;
        while (curr.next!=null){
            Node node = curr.next;
            curr.next = prev;
            prev =curr;
            curr = node;
        }
        curr.next = prev;
        tail= head;
        head= curr;
//        Node prevNode=head;
//        Node currNode= head.next;
//        while (currNode.next!=null){
//            Node newNode = currNode.next;
//            currNode.next =prevNode;
//           prevNode = currNode;
//           currNode= newNode;
//        }
//        currNode.next= prevNode;
//        head.next=null;
//        head = currNode;
    }
    //Displaying the LL
    public  void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" --> ");
            temp= temp.next;
        }
        System.out.println("NULL");
   }
}



