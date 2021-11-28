import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j =1; j < nums.length-i; j++) {
                if (nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }

            }
        }
            return nums;
        }
    }

