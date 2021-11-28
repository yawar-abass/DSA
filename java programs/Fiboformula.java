//pending
import java.math.*;
public class Fiboformula {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n){
        return  (int)((Math.pow((1+Math.sqrt(5))/2,n))-(Math.pow((1-Math.sqrt(5))/2,n)/Math.sqrt(5)));
    }
}
