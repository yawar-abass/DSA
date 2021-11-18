class Main{
    public static void main(String[] args) {
   int num =12345;
        System.out.println(sum(num));
    }
    public static  int sum(int n){
        if(n==0){
            return 0;
        }
        int s =0;
        int rem= n%10;
        s*=10+rem;
        sum(n/10);
    }
}