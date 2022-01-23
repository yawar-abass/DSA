package Searching;

import java.util.Scanner;

public class Search {
    // Main Method
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        int res = 0;
        boolean b = false;
        while (true) {
            System.out.println("Enter number to be searched :");
            int n = sc.nextInt();
            System.out.println("Enter '1' for Linear Search and '2' for binary search");
            System.out.println(" Enter 0 for Exit from the program");
            int num = sc.nextInt();
            if (num == 1) {
                res = linearSearch(arr, n);
                b =true;
                break;
            } else if (num == 2) {
                res = binarySearch(arr, n);
                b = true;
                break;
            }
            else if(num == 0){
                break;
            }
            else  {
                System.out.println("You Entered wrong number");
                System.out.print(" Try Again ");
            }

        }
        while(b){
            if (res == -1) {
                System.out.println("Number is not present");
                break;
            } else{
                System.out.println("Index of number is: " + res);
                break;
            }
        }
    }
// Binary Search
    private static int binarySearch(int[] arr, int n) {
        System.out.println(" Using Binary Search ");
        int start =0 , last = arr.length-1;
        while (start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(n>arr[mid]){
                start = mid+1;
            }
            else {
                last = mid-1;
            }
        }
        return -1;
    }
 // Linear Search
    private static int linearSearch(int[] arr, int n) {
        System.out.println("Using Linear Search ");
        int res;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
