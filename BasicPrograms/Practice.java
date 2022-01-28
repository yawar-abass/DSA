package BasicPrograms;

public class Practice {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(120));
    }
    public static int digitsInFactorial(int N){
        // code here
        long num = fac(N);
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static long fac(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
