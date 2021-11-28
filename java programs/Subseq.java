
import java.util.ArrayList;
public class Subseq {
    public static void main(String[] args) {

        System.out.println(subarray("","abc"));
    }
//    public static void sub(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch =up.charAt(0);
//        sub(p+ch,up.substring(1));
//        sub(p,up.substring(1));
//    }
    public static ArrayList<String> subarray(String p,String up){
    if(up.isEmpty()){
        ArrayList<String> ls = new ArrayList<>();
        ls.add(p);
        return ls;
    }
    char ch =up.charAt(0);
   ArrayList<String> left= subarray(p+ch,up.substring(1));
   ArrayList<String> right=  subarray(p,up.substring(1));
        left.addAll(right);
    return left;

}
}
