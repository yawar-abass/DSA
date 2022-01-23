package Queues;
// Deque array representation --> Using Circular Arrays
public class Deque_Array {
    int size =5;
    int arr[] = new int[size];
    int front, rear;
    Deque_Array(){
        this.front =-1;
        this.rear =-1;
    }
    //Inserting at the front end
    public void insertFront(int val){
        if(isFull()){
            System.out.println("Deque is full ");
            return;
        }
        if(front == -1){
            front =0;
            rear = 0;
            arr[front]=val;
            return;
        }
        if(front == 0){
            front = size-1;
        }else {
            front--;
        }
        arr[front] = val;
    }
    // Inserting at the rear end
    public void insertRear(int val){
        if(isFull()){
            System.out.println("Deque is full ");
            return;
        }
        if(rear == -1){
            front =0;
            rear =0;
            arr[rear] =val;
            return;
        }
        if(rear == size-1){
            rear = 0;
        }
        else {
            rear++;
        }
        arr[rear]= val;
    }
    // Deletion from front
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Stack is empty .You can't delete");
            return -1;
        }
        int val = arr[front];
        if(front == rear){
            front =-1;
            rear = -1;
            return val;
        }
        if(front ==size-1 ){
            front =0;
        }else {
            front++;
        }
        return val;
    }
    //Deletion from rear
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("Stack is empty .You can't delete");
            return -1;
        }
        int val = arr[rear];
        if(front == rear){
            front =-1;
            rear = -1;
            return val;
        }
        if(rear ==0){
            rear = size-1;
        }else {
            rear--;
        }
        return val;
    }

    private boolean isEmpty() {
        return front ==-1;
    }

    private boolean isFull() {
        if(front == 0 && rear ==size-1){
            return true;
        }
        if(rear+1 == front){
            return true;
        }
        return false;
    }
    // getfront
    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    // get rear element
    public int getRear(){
        if(isEmpty()) return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        Deque_Array da = new Deque_Array();
        da.insertRear(12);
//        da.insertFront(12);
//        da.insertRear(13);
//        da.insertFront(15);
//        da.insertRear(144);
//        da.deleteFront();
//        da.deleteRear();
//        System.out.println(da.getFront());
//        System.out.println(da.getRear());

    }
}
