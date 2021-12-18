package Recurrsion;

public class PathCount {
    public static void main(String[] args) {
//        System.out.println(count(3,3,0,0));
        printPath(3,3,0,0,"");
    }
    public static int count(int r,int c,int i,int j){
        if(i==r || j ==c){
            return 0;
        }
        if(i==r-1&&j==c-1){
            return 1;
        }

        int right = count(r,c,i,j+1);
        int left = count(r,c, i+1,j);

        return right+left;
    }
    public static void printPath(int r,int c,int i,int j,String str){
        if(i==r || j ==c){
            return;
        }
        if(i==r-1&&j==c-1){
            System.out.println(str);
            return;
        }
        printPath(r,c,i,j+1,str.concat("R"));
        printPath(r,c, i+1,j,str.concat("D"));
    }
}
