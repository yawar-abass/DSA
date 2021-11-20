import java.math.*;
public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]= {-1,2,4,-3,5,2,-5,2};
        System.out.println(max(arr));
    }
    public static int max(int []nums){
        int result =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
           sum =Math.max(nums[i],(sum+nums[i]));
           result = Math.max(result,sum);
        }
        return result;
    }
}
