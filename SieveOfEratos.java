public class SieveOfEratos {
    public static void main(String[] args) {
        int num =40;
        boolean [] primes = new boolean[num+1];//starts from 0
        isPrime(num,primes);
    }
    public static void isPrime(int n,boolean [] arr){
        // false means number in array is prime
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i+2;j<=n;j+=i){
                    arr[j]=true;//means not prime
                }
            }
        }
        for(int k=2;k<=n;k++){
            if(!arr[k]){
                System.out.print(k+" ");
            }
        }
    }
}
