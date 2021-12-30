package oops.Interfaces;

public class NiceCar implements Engine {
    private Engine engine;

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

    @Override
    public void accel() {
      engine.accel();
    }
}
