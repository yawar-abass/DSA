package Recurrsion;

public class Tower_Of_Hanoi {
    public static void toh(String src,String hel, String dest, int n ){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+ dest);
            return;
        }
        toh(src,dest,hel,n-1);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        toh(hel,src,dest,n-1);

    }

    public static void main(String[] args) {
        int n =3 ;
        toh("S","H","D",n);
    }
}
