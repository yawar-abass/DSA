package ArrayPackage;

import java.util.Arrays;

public class SymmitricMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 3, 5 },
                        { 3, 2, 4 },
                        { 5, 4, 1 }};
        int arr [] ={1,2,3,4,5};
        display(onedSymmtric(arr));
        System.out.println(size(arr));
    }
    //  Calculating the size of two d array
    // pending for 4 X 4 matrix
    public static  int size(int arr[]){
        int  len = arr.length-1;
        double count = len*(len+1)/2; // calculating the elements in the one d array
        int result = (int)Math.sqrt(count);// find the square of count --> i.e: the number of rows in our matrix;
        return result;
    }
    // using one d convert to two d matrix
    public static int [][] onedSymmtric(int arr[]){
        int len= size(arr);
        int matrix[][] = new int[len][len];
        int ar[]; // store the upper elements of the two d array like in mat : 3 5 4;
        int k =0,l=0; // k is used for index in arr, l --> size of new one d array (ar)
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(j>=i&&k<arr.length){// creating the upper triangular matrix
                    if(j>i){ // calculate the size of ar;
                        l++;
                    }
                    matrix[i][j] = arr[k]; // putting the elements in our 2D array
                    k++;
                }
                }
            }
        ar = new int[l];
        int m=0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(j>i ){
                    ar[m++]= matrix[i][j]; // putting the upper 3 elements of matrix in our 1D array(ar);
                }
            }
        }
        int n=0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                if(j<i ){
                    matrix[i][j] = ar[n++]; // putting those 3 elements at the lower triangular matrix except the diagonal

                }
            }
        }
        matrix[matrix.length-1][matrix.length-1] =arr[0];// putting ist element of arr in our matrix at the last index;
        return matrix;
    }
    //display
    public static void display(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Using two d matrix to one d matrix
    public static int [] twodSymmitric(int[][] mat){
        int count =0;
        for (int i = 0; i < mat.length; i++) { // calculating the size of one d array
            for (int j = 0; j <mat[i].length ; j++) {
                if(j>=i){
                    count++;
                }
            }
        }
        int matrix[] =new int[count-1];
        int k =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                if(i==mat.length-1){// Ignoring the last element in the last row of matrix
                    if(i==j){ // gives the last element in the matrix .
                        break;
                    }
                }
                if(j>=i){// considering the upper triangular matrix.
                    matrix[k]= mat[i][j];
                    k++;
                }
            }
        }

        return matrix;
    }
}
