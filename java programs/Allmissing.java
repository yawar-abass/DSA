//Google Question in leetcode.
//Q=Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums?
// Using Cyclicsort algorithm. Just comparing the elements with its correct index.
// if they are not equal just add them in list.
import java.util.*;
public class Allmissing {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(missing(arr));
    }
    public static List<Integer> missing(int []nums){
        ArrayList<Integer> list= new ArrayList<>();
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
            }

}
