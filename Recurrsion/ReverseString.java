package Recurrsion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abd";
        reverse(str,str.length()-1);
    }
    public static void reverse(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        char ch = str.charAt(idx);
        System.out.print(ch);
        reverse(str,idx-1);
    }
}
