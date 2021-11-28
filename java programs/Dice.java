public class Dice {
    public static void main(String[] args) {
  sub("",4);
    }
    public static void sub(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target ; i++) {
            sub(p+i,target-i);
        }
    }
}
