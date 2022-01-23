package BasicPrograms;

public class Decimal_Binary {
    public static void main(String[] args) {
        binaryToDecimal(101);
        decimalToBinary(5);
    }
    public static void decimalToBinary(int num){
        StringBuffer str = new StringBuffer();
       String s = new String();
        while (num>0){
            String rem = (num%2)+"";
            str.append(rem);
            num=num/2;
        }

        System.out.println(str.reverse());
    }
    public static void binaryToDecimal(int num){
        int count =0;
        int res =0;
        while (num>0){
            int rem = num%10;
            res+= (int)(rem*Math.pow(2,count++));
            num /=10;
        }
        System.out.println(res);
    }
}
