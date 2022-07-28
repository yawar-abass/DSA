package Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int []arr = {10,30,50,20,35,15};
        // make array into  heap
        for (int i = arr.length/2; i >=0 ; i--) {
            heapify(arr,i,arr.length-1);
        }
        System.out.println(Arrays.toString(arr));
        //sort the heap by deleting the root element and place it at the end. and place end element at root.
        // the apply the heapify  (except the last ele.) to make it heap again
        for (int i = arr.length-1; i >=0 ; i--) {
            delete(arr,0,i);
            heapify(arr,0,i-1);
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void heapify(int []arr,int i,int n){
        int largest = i;
        int l = 2*i+1;
        int r= 2*i+2;
        if(l<=n && arr[l]>arr[largest]){
            largest =l;
        }
        if(r<=n && arr[r]>arr[largest]){
            largest =r;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,largest,n);
        }

    }

    public static void delete(int []arr,int start,int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
}
