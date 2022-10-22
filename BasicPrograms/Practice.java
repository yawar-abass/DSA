package BasicPrograms;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i =0;i<arr.size();i++){
            for (int j = 0; j <3; j++) {
                arr.get(i).add(j);
            }
        }
        for (int i =0;i<arr.size();i++){
            for (int j = 0; j <arr.get(i).size(); j++) {
                System.out.print(arr.get(j)+" ");
            }
            System.out.println();
        }


    }


}

