package Queues;
// Array implementation of Queue
public class Queue_Array_imp {
   final int size = 5;
   int arr[] = new int[size];
   int front , rear;
   Queue_Array_imp(){
       front =-1;
       rear =-1;
   }
   public boolean isFull(){
       return (rear == size-1);
   }
   public boolean isEmpty(){
       return (front == -1);
   }
   public int peek(){
       if(isEmpty()){
           return -1;
       }
       return arr[rear];
   }
   public void enqueue(int item){
       if(isFull()){
           System.out.println("Queue overflow");
           return;
       }
       if(front ==-1){
           front =0;
       }
       rear++;
       arr[rear] =item;
       System.out.println("Inserted :" +item);
   }
   public int dequeue(){
       if(isEmpty()){
           System.out.println("Queue is empty : Underflow");
           return -1;
       }
       int val = arr[front];
       if(front >= rear){
           front =-1;
           rear =-1;
       }
       front++;
       System.out.println("Deleted : " + val);
       return val;
   }
   public void display(){
       System.out.print("Queue --> ");
       for (int i = front; i <=rear ; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        Queue_Array_imp q = new Queue_Array_imp();
        for (int i = 1; i <4 ; i++) {
            q.enqueue(i);
        }
        q.display();
        q.dequeue();
        q.display();

    }
}
