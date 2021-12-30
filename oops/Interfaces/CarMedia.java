package oops.Interfaces;

public class CarMedia implements Media{

    @Override
    public void start() {
        System.out.println("Start the Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Music");
    }
}
