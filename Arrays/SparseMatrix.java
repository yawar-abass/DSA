package Arrays;

import java.util.Arrays;

public class SparseMatrix {
    public static void main(String args[]){
        int orginal[][] ={ //  original  matrix
                {0,1,0,0},
                {0,0,2,0},
                {8,0,0,0}
        };
        LL list = new LL();
        for (int i = 0; i <orginal.length ; i++) {
            for (int j = 0; j < orginal[i].length; j++) {
                if(orginal[i][j]!=0){
                    list.insert(orginal[i][j],i,j);
                }
            }
        }
        list.display();
//       arrayrep(orginal);

    }
    // ARRAY REPRESENTATION
    public static void arrayrep(int orginal[][]){
        int size =0; // no. of columns in sparse matrix == no. of non-zero elements in original matrix
        for (int i = 0; i <orginal.length ; i++) {
            for (int j = 0; j < orginal[i].length; j++) {
                if(orginal[i][j]!=0){// checking the non-zero elements in original matrix
                    size++;
                }
            }
        }
        int res[][] = new int[3][size];
        int k =0;
        for (int i = 0; i <orginal.length ; i++) {
            for (int j = 0; j < orginal[i].length; j++) {
                if(orginal[i][j]!=0){
                    res[0][k] = i; // Rows
                    res[1][k]= j;// Columns
                    res[2][k] = orginal[i][j]; // Value
                    k++;
                }
            }
        }
        // print the sparse matrix
        for (int i = 0; i <res.length ; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// LINKED LIST REPRESENTATION
class LL{
    Node head;
    int size;
    LL(){
        this.size =0;
    }
    static class Node{
        private int val;
        private int row;
        private int col;
        private Node next;
        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
                    }
    }
    public void insert(int val,int row,int col){
        Node node = new Node(val,row, col);
        size++;
        if(head==null){
            head = node;
            return;
        }
       Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        node.next =null;
        temp.next =node;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print("Value ="+temp.val+" Row = "+ temp.row+" Column = "+ temp.col+"-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}
