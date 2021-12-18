package BasicPrograms;

public class Pattern {
    public static void main(String[] args) {
        printPattern(4,4);
    }
    public static void printPattern(int r, int c){
        int k=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
