//Amazon question Missing number in the array leetcode question.
//Q=Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array?
//Using Cyclic Sort Algorithm
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={4,2,0,1};
        System.out.println(missing(arr));
    }
    public static int missing(int []nums){
        int i=0;
        while(i<nums.length){
            int index= nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;//if no number is missing return tha length of array;
    }
}
