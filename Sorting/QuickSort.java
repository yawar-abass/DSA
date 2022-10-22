package Sorting;

import java.util.Arrays;

public class QuickSort {
    static int count=0;
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    public static  void sort(int arr[],int l, int h){
        if(l<h) {
            int j = partision(arr, l, h);
            count++;
            sort(arr, l, j);
            sort(arr, j + 1, h);
        }
    }
    public static int partision(int []arr,int l, int h){
       int pivot = arr[l];
       int i=l,j=h;
        while (i<j){
           while (arr[i]<=pivot&&i<j){
               count++;
               i++;
           }
           while (arr[j]>pivot){
               j--;
               count++;
           }
           if(i<j){
               swap(arr,i,j);
           }
       }
       swap(arr,j,l);
        return j;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
