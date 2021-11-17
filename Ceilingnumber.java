//same as binarysearch except that return start -1 at the end of while loop if target is not present.
public class Ceilingnumber {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,10,11,14};
        System.out.println(Ceiling(arr,12));
    }
    public static int Ceiling(int nums[],int target){
        int start= 0;
        int end =nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==nums[mid]){
                return target;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return nums[start-1];
    }
}
