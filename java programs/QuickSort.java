import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,3};
        quicks(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicks(int []nums,int low, int hi){
        if(low>=hi){
            return;
        }
        int s= low;
        int e =hi;
        int m= s+(e-s)/2;
        int pivot=nums[m];
        while (s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp= nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;e--;
            }
            quicks(nums,low,e);
            quicks(nums,s,hi);
        }
    }
}
