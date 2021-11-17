public class ArmStrong {
    public static void main(String[] args) {
        int num=153;
        if(isArm(num)){
            System.out.println(num+" is armStrong Number");
        }
        else
            System.out.println(num+" is not armStrong Number");
    }
    public static boolean isArm(int n){
        int org= n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum= sum+(rem*rem*rem);
        }
        if(org==sum)
            return true;
        else
            return false;
    }
}
