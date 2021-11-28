public class fibonacci{
    public static void main(String args[]){
        int num=10;
        int ftrem= 0;
        int sterm =1;
        System.out.print(ftrem+" "+sterm+" ");
        for(int i=1;i<num;i++){
            int temp=sterm;
            sterm=ftrem+sterm;
            ftrem=temp;
            System.out.print(sterm+" ");
        }
    }
}
