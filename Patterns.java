public class Patterns {
    public static void main(String[] args) {
          print(4,0);
    }
    public static void print(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            print(r,++c);
        }else{
            System.out.println();
            print(--r,0);
        }
    }
}



