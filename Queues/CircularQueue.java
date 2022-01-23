package Queues;
// Implement circular Queue using Arrays;
// pending display functoin;
public class CircularQueue {
       int size =5;
       int arr [] = new int[size];
       int front, rear;
       CircularQueue(){
              front =-1;
              rear =-1;
       }
       public boolean isFull(){
              if(front ==0 && rear == size-1){// our queue is full
                     return true;
              }
              if(rear+1 == front){//if the next element is front (queue is full) --> rear+1 == front.
                     return true;
              }
              return false;
       }
       // Insertion in circular Queue
       public void insert(int item){
              if(isFull()){
                     System.out.println("Queue is full");
                     return;
              }
              if(front == -1 && rear ==-1){ // if queue is empty
                     front = 0;
                     rear = 0;
              }
             else if(rear == size-1 && front !=0){//           F       R  -->    R  F
                     rear =0;                     // Queue =[ ,1,2,3,4,5] -->  [ 12,1,2,3,4,5]
              }
             else {
                     rear++;
              }
             arr[rear]= item; // Asigne the value in the queue
       }
       // Deletion in Queue
       public int delete(){
              if(isEmpty()){
                     System.out.println("Queue is empty :underflow");
                     return -1;
              }
              int val = arr[front];
              if (front == rear){ // Only one element in the queue
                     front = -1;
                     rear = -1;
                     return val;
              }
              if(front == size-1){// if the front is at last index --> value is already stored
                     front = 0;// point it to first index.--> last element is deleted
                     return val;// return the value of last index.
              }
              front = front+1;
              return val;
       }
       //Display function

       public void display(){
              if(isEmpty()){
                     System.out.println("Queue is empty");
                     return;
              }
              if(front==0){ // means the queue is not circular
                     for (int i = front; i <= rear ; i++) {
                            System.out.print(arr[i]+" ");
                     }
              }
              else { // queue is circular now
                     for (int i = front; i <size ; i++) {
                            System.out.print(arr[i]+" ");
                     }
                     for (int j = rear; j <front ; j++) {
                            System.out.print(arr[j]+" ");
                     }
              }
              System.out.println();
       }

       private boolean isEmpty() {
              return front == -1;
       }
       // main method
       public static void main(String[] args) {
                    CircularQueue cq = new CircularQueue();
                    cq.insert(1);
                    cq.insert(2);
                    cq.insert(3);
                    cq.insert(4);
                    cq.insert(5);
                    cq.display();
                    cq.delete();
                    cq.display();
                    cq.insert(1);
                    cq.display();
      }

      }


