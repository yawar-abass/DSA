package BasicPrograms;

public class Gcd {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 =8;
        int res =0;
        for (int i = 1; i <=num1 && i<= num2 ; i++) {
                 if (num1%i==0 && num2%i == 0){
                     res =i;
                 }
        }
        System.out.println(res);
    }
}
