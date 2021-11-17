//leetcode question Find duplicate number in the array
//Use Cyclic Sort.
public class FindDuplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
    public static int duplicate(int []nums){
        int i=0;
        while(i<nums.length) {
            if (nums[i] != i + 1) {//if the number is not at its correct index check whether this element is duplicate
                int correct = nums[i] - 1;// or swap it with its correct index.
                if (nums[i] != nums[correct]) {//if the number at index i is not equal to the number at correct index
                    int temp = nums[correct];// then swap the number with its correct index.
                    nums[correct] = nums[i];
                    nums[i] = temp;
                } else//if the number at index i is equal to the correct index then the number is duplicate and return it
                    return nums[i];
            } else//if the number is at correct index move to next number.
                i++;
        }
            return -1;
            }
}
