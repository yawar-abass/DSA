package Recurrsion;

public class SkipA {
    public static void main(String[] args) {
        String str ="baccad";
        skip(str,0,"");
    }
    public static void skip(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr );
            return;
        }
        char ch = str.charAt(idx);
        if (ch == 'a') {
            skip(str,idx+1,newstr);
        }else {
            skip(str,idx+1,newstr+ch);
        }
    }
}
