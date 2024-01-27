package ArrayPackage;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        // to create an array
        int [] sampleArray = new int[5];

        int [][] threeDimn = new int[2][3];
        for (int i = 0; i <threeDimn.length ; i++) {
            for (int j = 0; j < threeDimn[i].length; j++) {
                threeDimn[i][j]=i+j;
                System.out.println(threeDimn[i][j]);
            }

        }


        System.out.println(Arrays.toString(threeDimn));
    }
}
