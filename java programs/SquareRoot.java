//using Binary Search
public class SquareRoot {
    public static void main(String[] args) {
        int num =40;
        int p =3;
        System.out.printf(" %.3f",square(num,p));
    }
    public static double square(int n,int p){
        int s=0;
        int e=n;
        double root =0.0;
        while(s<=e){
            int m= s+(e-s)/2;
            if(m*m==n){
                return  m;//if number is a perfect square
            }
            if(m*m>n){
                e=m-1;
            }else
                s=m+1;
        }
        // if number is not a perfect square
        double inc =0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc =inc/10;
        }
        return root;
    }
}
