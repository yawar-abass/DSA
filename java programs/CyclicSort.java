import java.util.Arrays;
// Check that the element is at its correct index or not. If not then swap it with its correct index.
// else check the next element.
//In Cyclic Sort the given array should be form range 1-N .
public class CyclicSort {
    public static void main(String [] args){
        int arr[]= {4,5,3,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int nums[]){
        int i=0;
        while(i<nums.length){
            int index= nums[i]-1;
            if(nums[i]!=nums[index]){
                int temp= nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }

    }
}
