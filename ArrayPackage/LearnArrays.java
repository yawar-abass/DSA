package ArrayPackage;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        // to create an array
        int [] sampleArray = {12,13,14,15,16};
        int index =2;
        int value = 144;

        for (int i = sampleArray.length-1; i >=index ; i--) {
            if(i==index){
                sampleArray[i]= value;
                break;
            }
            sampleArray[i]= sampleArray[i-1];
        }
        System.out.println(Arrays.toString(sampleArray));



    }
}
