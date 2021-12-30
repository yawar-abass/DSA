package oops;

public class C extends B {
    private String name ="This is parivate";
//    public static C obj;
   int a =10;
    public String getName() {// getr's for private
        return name;
    }

    public void setName(String name) {//setr's for private
        this.name = name;
    }

    int d;
    C(int a, int b, int c, int d){
        super(a,b,c);
        this.d= d;
    }
//    void display(int a, int b ,int c,int d){
//        super(a,b,c);
//        System.out.println(d);
//    }
}
