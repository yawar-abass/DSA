public class BinarySearch {
    public  static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(Bsearch(arr,5));
    }
    public static int Bsearch(int []nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                start= mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
