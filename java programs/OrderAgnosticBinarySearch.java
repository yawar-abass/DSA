public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={23,24,25,26,27};
        System.out.println(OABsearch(arr,24));
    }
    public static int OABsearch(int []nums,int target){
        int start=0;
        int end=nums.length-1;
       boolean isAsc=nums[start]<nums[end];
       while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
               return mid;
           }
           if(isAsc){
               if(target<nums[mid]){
                   end=mid-1;
               }
               else
                   start=mid+1;
           }
           else{
               if(target<nums[mid]){
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }

           }
       }
        return -1;
    }
}
