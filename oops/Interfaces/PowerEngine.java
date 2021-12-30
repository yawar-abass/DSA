package oops.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("PowerEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stops");
    }

    @Override
    public void accel() {
        System.out.println("PowerEngine Accelerates");
    }
}
