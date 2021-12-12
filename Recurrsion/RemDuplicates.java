package Recurrsion;

public class RemDuplicates {
    public static void main(String[] args) {
        String str = "abbccde";
        dup(str,0,"");
    }
    public static  boolean [] arr = new boolean[26];
    public  static void dup(String str,int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        if (!arr[ch-'a']){
            arr[ch-'a']=true;
            dup(str,idx+1,newstr+ch);
        }else{
            dup(str,idx+1,newstr);
        }


    }
}
