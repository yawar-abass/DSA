package BasicPrograms;
import  java.util.*;
public class Cpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=2;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <=i; j++) {
                for (int k = 0; k < l; k++) {
                    System.out.print("  ");
                    l--;
                }
                System.out.print(" * ");
                     }
                System.out.println();
             }
        }
    }

