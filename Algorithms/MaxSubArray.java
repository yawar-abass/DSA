package Algorithms;

public class MaxSubArray {
    public static void main(String[] args) {
        int []arr = {-2, -5, 6, -2, -3, 1, 5, -6};

        System.out.println(subArray(arr,0,arr.length-1));
    }

    //Get the maximum sum of subArray using Divide and Conquer
    public static int crossSum(int[] arr,int low,int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum =0;
        int rightSum =  Integer.MIN_VALUE;
        int leftIndex =0, rightIndex = 0;
        for (int i = mid; i >=low ; i--) {
            sum+=arr[i];
            if(leftSum<sum){
                leftSum = sum;
                leftIndex =i;
            }
        }
        sum =0;
        for (int j = mid+1; j <=high ; j++) {
            sum+=arr[j];
            if(rightSum<sum){
                rightSum = sum;
                rightIndex =j;
            }
        }

       return Math.max(leftSum+rightSum,Math.max(leftSum,rightSum));
    }
    public static int subArray(int []arr,int l,int h){
        if(l==h){
            return arr[l];
        }
        int mid = l+(h-l)/2;
        return Math.max(Math.max(subArray(arr,l,mid),subArray(arr,mid+1,h)),crossSum(arr,l,mid,h));
    }
}
