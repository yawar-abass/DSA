package ArrayPackage;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int arr[] ={1,2,3,4,5,6,};
        System.out.println("Lower traingular matrix");
        display(onedlowertrang(arr));
        System.out.println("Upper traingular matrix");
        display(oneduppertraing(arr));
//        lowertrg(matrix);
//     uppertrg(matrix);
//        upper(matrix);
    }
   // converting the one dimensional array into two dimensional lower triangular matrix.
    public static int[][] onedlowertrang(int arr[]){
        int size = sizematrix(arr);
       int matrix[][] = new int[size][size];
        int k =0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i>=j){ // in lower traingular row value is grater or equal to the column value
                    matrix[i][j]= arr[k];
                    k++;
                }else{
                    matrix[i][j]= 0;
                }
            }
           }
        return matrix;
        }
        // Upper triangular matrix using one dimsional array
        public static int [][] oneduppertraing(int arr[]){
        int size = sizematrix(arr);
        int k =0;
        int matrix [][] = new int[size][size];
            for (int i = 0; i <matrix.length; i++) {
                for (int j = 0; j <matrix[i].length; j++) {
                    if(j>=i){
                        matrix[i][j] = arr[k];
                        k++;
                    }
                    else{
                        matrix[i][j] =0;
                    }
                }

            }
            return  matrix;
        }
        // Displaying the two d matrix;
    public static void display(int [][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sizematrix(int arr[]){// calculating the length of one dimensional matrix
        int count =0;
        int curr =1;
        int i=0;
        while (i<arr.length){
            i+=curr++;
            count++;
        }
        return count;
    }

    //Lower Traingular matrix using One dimensional array
    public static void lowertrg(int matrix[][]){
        int count =0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(i>=j){
                     count++;
                }
            }
        }
        int Lower [] = new int[count];
        int k =0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(i>=j){
                    Lower[k] = matrix[i][j];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(Lower));

    }
    //Upper Traingular matrix using Two dimensional array
    public static void uppertrg(int matrix[][]){
        int upper[][] = new int[3][3];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(j<i){
                    upper[i][j] =0;
                }else{
                    upper[i][j]=matrix[i][j];
                }

            }
        }
        for (int i = 0; i < upper.length ; i++) {
            for (int j = 0; j < upper[i].length; j++) {
                System.out.print(upper[i][j]+" ");
            }
            System.out.println();

        }
    }
    // Printing the upperTraingular matrix without zeros
    public static void upper(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++){
                if(j>=i){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
