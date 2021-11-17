//Checking Unique element in array
public class UniqueNo {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,2,3,5};
        System.out.println(check(arr));
    }
    public static int check(int arr[]){
        int unq =0;
        for(int a :arr){
            unq^= a;
        }
        return unq;
    }
}
