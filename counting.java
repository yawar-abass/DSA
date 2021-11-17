public class counting{
    public static void main(String[] args) {
        int num=45536;
        System.out.println(count(num));
    }
    public static int count(int n){
        int t=0;
        while (n>0){
            int rem=n%10;
            if(rem==5)
                t++;
            n/=10;
        }
        return t;
    }
}
