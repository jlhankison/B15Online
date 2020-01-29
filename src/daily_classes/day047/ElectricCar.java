package daily_classes.day047;

public class ElectricCar extends Car{

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("Electric car turns on");
    }

    @Override
    public void goForward() {
        System.out.println(brand + " moves forward");

    }

    @Override
    public void goBackward() {
        System.out.println(brand + " moves backward");

    }
}
