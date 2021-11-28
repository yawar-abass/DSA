public class ReverseNUM {
    public static void main(String[] args) {
        int num=1234;
        System.out.println(reverse(num));

    }
    public static int reverse(int n){
        int result=0;
        while(n>0){
            int rem=n%10;
            result=result*10+rem;
            n/=10;
        }
        return result;
    }
}
