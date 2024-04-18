package BasicPrograms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Practice {
    static class Stack{
        static int []arr;
        static int tos= -1;
       Stack(int size){
         arr  = new int[size];

       }
       public void push(int item){
           ++tos ;
           if(tos>arr.length){
               System.out.println("Stack Overflow: Item can't be inserted");
               return;
           }
           arr[tos] = item;
           System.out.println(item+" pushed in the stack");
       }
       public int pop(){
           if(tos==-1){
               return -1;
           }
           int lastItem = arr[tos];
           --tos;
           return lastItem;
       }
       public void displayStack(){
           for (int j = tos; j >=0 ; j--) {
               System.out.println(arr[j]);
           }
       }

    }
    public static void main(String[] args) {
       Stack stk = new Stack(10);
       stk.push(12);
       stk.push(23);
        stk.push(25);
        stk.push(28);
        stk.displayStack();



    }


}

