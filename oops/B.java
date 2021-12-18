package oops;

public class B extends A{

        int c;
        B(int a, int b,int c){
            super(a,b);
            this.c =c;
        }
//        void display(int a ,int b, int c){
//            super(a,b);
//            System.out.println(c);
//        }

        @Override
        //overriding the parent class method
        int sum(int a, int b){
            System.out.println("This is child class method");
            return a+b;

        }
        //Overloading
       void sum(){
           System.out.println("I am overloading the sum method");
       }
}
