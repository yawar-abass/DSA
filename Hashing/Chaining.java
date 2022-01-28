package Hashing;
// Avoid collisions Using Separate Chaining ||  Open Chaining
public class Chaining {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static private int key;
    static private int  size =10;
    Node arr[]= new Node[size];
    Chaining(){
        for (int i = 0; i <size ; i++) {
            arr[i]=null;
        }
    }
    public void insert(int val){
        Node node = new Node(val);
         key = val%size;
         if(arr[key]==null){
             arr[key] = node;
         } // Collision
         else {
             Node temp =arr[key];
             while (temp.next!=null){
                 temp = temp.next;
             }
             node.next =null;
             temp.next =node;
         }
    }
    // Searching
    void search(int val){
        key = val%size;
        if(arr[key].data==val){
            System.out.print(val+ " Value is present ");
        }
        else {
            Node temp = arr[key];
            while (temp!=null){
                if(temp.data == val){
                    System.out.println("Value is present");
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Value is not present");
        }
    }
    void delete(int val) {
        int key = val % size;
        Node temp = arr[key];
        if (temp != null) {
            if (temp.data == val) {
               temp.data = temp.next.data;
               temp.next = temp.next.next;
            }
            else {
                while (temp.next!=null){
                    if(temp.data == val){
                        temp.data = temp.next.data;
                        temp.next = temp.next.next;
                        return;
                    }
                    temp = temp.next;
                }
                temp=temp.data==val?null:temp;
            }
        }
    }
    void display(){
        for (int i = 0; i < size; i++) {
            Node temp = arr[i];
            System.out.printf("arr[%d] --> ",i);
            while (temp!=null){
                System.out.print(temp.data+"--> ");
                temp =temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Chaining ht = new Chaining();
        ht.insert(12);
        ht.insert(14);
        ht.insert(14);
        ht.insert(17);
        ht.insert(13);
        ht.insert(24);
        ht.insert(43);
        ht.display();
        ht.search(12);

    }
}
