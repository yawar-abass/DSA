package StackPackage;

//Stack implementation using arrays
public class StackArray {
    int size =10;
    int tos;
    StackArray(){
        tos =-1;
    }
    int arr[] = new int[size];
    public boolean isFull(){
        if(tos == size-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){ return tos == -1;}
    public void push(int item){
        if(isFull()){
            System.out.println("Overflow i.e: Stack is full");
            return;
        }

        arr[++tos] = item;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow i.e: Stack is Empty");
            return -1;
        }
        int val = arr[tos];
        --tos;
        return val;
    }
    public void display(){
        for (int i = tos; i>=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        StackArray st = new StackArray();
        st.push(12);
        st.push(13);
        st.push(14);
        st.display();
        System.out.println(st.pop());
        st.display();
    }

}
