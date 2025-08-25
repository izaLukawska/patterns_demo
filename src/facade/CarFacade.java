package facade;

public class CarFacade {

    private final CarLights carLights = new CarLights();

    private final CarEngine carEngine = new CarEngine();

    private final CarBattery carBattery = new CarBattery();

    public void startCar() {
        carEngine.start();
        carBattery.turnOn();
        carLights.turnOn();
        System.out.println("Car started");
    }

    public  void stopCar() {
        carLights.turnOff();
        carBattery.turnOff();
        carEngine.stop();
        System.out.println("Car stopped");
    }
}
