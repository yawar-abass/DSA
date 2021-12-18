package oops;

public class Outer {
  static class Inner1{// Must declare the inner classes as static
        int a;
        int b;
        Inner1(){
            System.out.println("I am inner1 class Constructor ");
        }
        int avg(int a, int b){
            return (a+b)/2;
        }
    }
    static  class Inner2 extends Inner1{// inherit the inner1 class
      Inner2(){
          System.out.println("I am inner2 class constructor ");
      }
      @Override
      int avg(int a, int b){// Overriding the inner1 class method
          return (a+b)/2;
      }

    }


}
class Newclass extends Outer{
    public static void main(String[] args) {
        Inner1 in = new Inner1();//We can't create an object of inner class unless we inherit the outer class.
        System.out.println(in.avg(2,3));//inner1 class method
        Inner2 in2 = new Inner2();// accessing both the constructors because of inherting the inner1 class
        System.out.println(in.avg(3,4));

    }
}
