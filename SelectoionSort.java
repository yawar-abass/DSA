//pending
import java.util.*;
public class SelectoionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int maxindex = getmaxindex(nums, 0, last);
            swap(nums, maxindex, last);
        }
    }

    public static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    public static int getmaxindex(int[] nums, int start, int last) {
        int max = start;
        for (int i = start; i<=last; i++) {
            if (nums[max] > nums[i]) {
                max = i;
            }
        }
        return max;
    }
}

