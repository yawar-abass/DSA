import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(isPalin(str));
    }
    public static boolean isPalin(String str){
        str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end= str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
