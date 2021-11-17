import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        insort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insort(int []nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
