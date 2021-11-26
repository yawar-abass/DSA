public class SearchRec {
    public static void main(String args[]){
        int []arr= {12,13,1,14};
        int target= 13;
        System.out.println(search(arr,target,0));
    }
    public static int search(int []arr, int t,int index){
        if(arr[index]==t){return index;}
        return search(arr,t,index+1);
    }
}
