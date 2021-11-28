//Using bit wise operators
public class Evenodd {
    public static void main(String[] args) {
        int num = 45;
        if(check(num)){
            System.out.println(num+" is even number");
        }else
            System.out.println(num+" is odd number");
    }
    public static boolean check(int n){
        return ((n&1)==0);
    }
}
