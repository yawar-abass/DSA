// use binary search without using length of array. means search in infinite array
class Main{
    public static void main(String[] args) {
     int arr[]={12,14,15,16,17,18};
     int target =15;
        System.out.println(search(arr,target));
    }
    public static int search(int []arr,int target){
        int start =0;
        int end= 1;
         while(target>arr[end]){
             int temp =end+1;//new start
             end =end+(end-start+1)*2;//new end
             start= temp;
        }
         return  binary(arr,target,start,end);
    }
    public static int binary(int nums[],int tar, int s ,int e){
        while (s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==tar){
                return mid;
            }
            if(tar>nums[mid]){
                s=mid+1;
            }else
                e=mid-1;
        }
        return -1;
    }
}