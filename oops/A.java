package oops;

import com.sun.security.jgss.GSSUtil;
//Inheritance and other stuff like that
public class A {
    int a;
    int b ;
    A(int a , int b){
        this.a =a ;
        this.b = b;
    }
//    void display(int a , int b){
//        System.out.println(a);
//        System.out.println(b);
//    }
   int sum(int a ,int b ){
       System.out.println("This is parent class method");
        return a+b;
    }
}


