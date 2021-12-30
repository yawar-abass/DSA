package oops;
//Abstraction
public abstract class Parent {
    int age;
    public Parent(int age){
        this.age=age;
        System.out.println(age);
    }
   static void display(){
        System.out.println("I am in parent class");
    }
    abstract void career();//Abstract method

}
