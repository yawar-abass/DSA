package Sorting;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int []arr = {6,0,2,0,1,3,4,6,1,3,2};
        System.out.println(Arrays.toString(  sort(arr)));
    }

    public static  int max(int []arr){
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int[] sort(int []arr){
        int []count= new int[max(arr)+1];
        int []output= new int[arr.length];

        //count the number of elements in original array
        for (int k : arr) {
            count[k] = count[k] + 1;
        }
        //get the index of the output array
        for (int j = 1; j < count.length; j++) {
            count[j] = count[j]+count[j-1];
        }
        // place the original array element in output array using indices in count array
        for (int i =0;i<arr.length;i++) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]=count[arr[i]]-1;

        }
        return output;

    }
}
