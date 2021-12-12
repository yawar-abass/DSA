package Recurrsion;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        sub(str,0,"");
    }
    public static void sub(String str,int index,String comb){
        if(index==str.length()){
            System.out.println(comb);
            return;
        }
        char ch = str.charAt(index);
        sub(str,index+1,comb+ch);
        sub(str,index+1,comb);

    }
}
