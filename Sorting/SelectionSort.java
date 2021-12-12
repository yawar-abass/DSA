package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
      int arr[] = {4,5,1,2,3};
      sort(arr);
    }
    public static void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j =i; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    }


