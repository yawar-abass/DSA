package Recurrsion;

public class GCD {
    // Way 1 :
    public static int gcd1(int a, int b){
        if(b ==0){
            return a;
        }
        return gcd1(b,a%b);
    }
    // Way 2
    public static int gcd2(int a, int b){
        if(b==0) return a;
        if(a==0){
            return b;
        }
        if(a>b) return gcd2(a-b,b);
        return gcd2(a,b-a);
    }
    public static int lcm(int a , int b){
        int hcf = gcd2(a, b);
        int prod = a*b;
        return (prod/hcf);
    }

    public static void main(String[] args) {
//        System.out.println(gcd2(36,60));
        System.out.println(lcm(15,25));
    }
}
