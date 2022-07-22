package Algorithms;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][]A ={
                {1,2,3},
                {4,5,6}
        };
        int [][]B ={
                {10,11},
                {20,21},
                {30,31}
        };

        int [][] c = new int[A.length][A.length];
        matrixMul(A,B);
    }

    //brute-force approach
    public static void matrixMul(int [][]A,int[][]B){
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < B[i].length; j++) {
                int sum = 0;
                for (int k = 0; k <A[i].length; k++) {
                    sum+=A[i][k]*B[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();

        }
    }
}
