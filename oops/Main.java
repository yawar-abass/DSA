package oops;

public class Main {
    public static void main(String[] args) {
        B b = new B(1,2,3);//child class object
        System.out.println(b.a);
        System.out.println(b.sum(2,3));//Accessing child class method
        A a = new A(1,2);// Parent class object
        System.out.println(a.sum(3,3));//Accessing the parent class method
        C c = new C(1,2,3,4);
        System.out.println(c.getName());//call geters
        c.setName("This is a setter");//calling setr
        System.out.println(c.getName());

//        B c = new A(1,2);
//        System.out.println(c.a);
    }
}
