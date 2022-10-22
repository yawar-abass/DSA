package Algorithms;
// Find the ith smallest element using Divide and Conquer {Linear time Selection}
public class SmallestElement {
    public static void main(String[] args) {
        int []arr ={3,4,2,5,6};
        System.out.println(randomizedSelect(arr,0,arr.length-1,4));
    }
    public static int randomizedSelect(int []arr,int p, int r, int i){
        if(p==r){
            return arr[p];
        }
        int q= part(arr,p,r);
        int k = q-p+1;
        if(i==k){
            return arr[q];
        }
        else  if(i<k)
            return randomizedSelect(arr,p ,q-1,i);
        else
            return randomizedSelect(arr,q+1,r,i-k);
    }

    private static int part(int[] arr, int p, int r) {
        int pivot = 0;
        int i = p,j=r;
        while (i<=j){
            while ( i<arr.length&&arr[i]<=arr[pivot] ){
                i++;
            }
            while (arr[j]>arr[pivot]){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;

    }
}
