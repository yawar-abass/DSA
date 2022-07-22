package BasicPrograms;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        int [][]arr = new int[3][3];
        System.out.println(maxSum(arr,0,0));

    }

    public static int maxSum(int [][]arr,int r,int c){
       if(r==arr.length-1 || c== arr[0].length-1){
           return 1;
       }
       int down = maxSum(arr,r+1,c);
       int right = maxSum(arr,r,c+1);
       return down+right;

    }


}

