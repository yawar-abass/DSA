package BasicPrograms;

public class Oops {
    public static void main(String[] args) {
        Fruits ft = new Fruits("Apple","Banana");
        ft.display();
        Fruits ftt = new Fruits("Mango","Grapes");
        ftt.display();
    }
}
class Fruits{
    String fruit1 ;
    String  fruit2 ;
    Fruits(String fruit1,String fruit2) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;

    }
    public void display(){
        System.out.println(fruit1);
        System.out.println(fruit2);
    }
    public int num(){

        return 34;
    }
}
