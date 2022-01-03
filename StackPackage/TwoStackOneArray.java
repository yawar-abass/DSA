package StackPackage;

public class TwoStackOneArray{
     int size =10;
     int arr[] = new int[size];
     int tos1;
     int tos2;
    public TwoStackOneArray() {
        tos1 =-1;
        tos2 =size;
    }
    public void push1(int val){
        if(tos1+1==tos2){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++tos1] = val;
        System.out.println("Stack1 element pushed: " + val);
    }
    public void push2(int val){
        if(tos1+1==tos2){
            System.out.println("Stack Overflow");
            return;
        }
        arr[--tos2] = val;
        System.out.println("Stack2 element pushed: " + val);
    }
    public int pop1(){
        if(tos1==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val = arr[tos1];
        tos1--;
        System.out.print("stack1 element poped: ");
        return val;
    }
    public int pop2(){
        if(tos2==size){
            System.out.println("Stack is Empty ");
            return -1;
        }
        int val = arr[tos2];
        tos2++;
        System.out.print("Stack2 Element Poped: ");
        return val;
    }
    public void display1(){
        for (int i = tos1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void display2(){
        for (int i = tos2; i<=size-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStackOneArray stk = new TwoStackOneArray();
        stk.push1(1);
        stk.push1(2);
        stk.push1(3);
        stk.display1();
        stk.push2(9);
        stk.push2(6);
        stk.push2(61);
        stk.display2();
        System.out.println(stk.pop2());
        stk.display2();
    }
}
