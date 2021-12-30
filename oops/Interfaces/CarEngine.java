package oops.Interfaces;

public class CarEngine implements Engine{

     @Override
    public void start() {
        System.out.println("Start the Engine");
    }
    public void accel() {
        System.out.println("Accelerate the Engine");
    }
    public void stop(){
        System.out.println("Stop the Engine");
    }
}
