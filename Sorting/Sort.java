package Sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class Sort {
    public static void main(String[] args) {
        int []arr = {4,3,2,10,12,1,5,3};
//        selectionSort(arr);
//        bubbleSort(arr);
//        insertSort(arr);
        shellSort(arr);
    }
    // Selection Sort
    public static void selectionSort(int arr[]){
        int s =0;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = findMin(arr,s);
            swap(arr,minIndex,s);
            ++s;
        }
        System.out.println(Arrays.toString(arr));
    }
 // Swap
    private static void swap(int arr[],int minIndex, int s) {
        int temp = arr[minIndex];
        arr[minIndex]= arr[s];
        arr[s]=temp;
    }

    private static int findMin(int[] arr, int s) {
        int min = s;
        for (int i = s; i < arr.length; i++) {
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    //Bubble Sort
    static void bubbleSort(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                 if(arr[j-1]>arr[j]){
                     int temp = arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]= temp;
                 }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Insertion Sort
    static void insertSort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Shell Sort
    static void shellSort(int arr[]){
        int n = arr.length;
        for (int gap = n/2; gap >=1 ; gap=gap/2) {
            for (int j = gap; j <n ; j++) {
                for (int i = j-gap; i >=0; i=i-gap) {
                    if(arr[i]>arr[i+gap]){
                        int temp = arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap] =temp;
                    }
                    else
                        break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

