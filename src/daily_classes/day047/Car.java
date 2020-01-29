package daily_classes.day047;

// I don't want to create a car object using this class
// I only want this class to be a super class to provide
// reusable fields and methods for the sub class
public abstract class Car {

    int year;
    String brand;

    public abstract void start();

    public abstract void goForward();

    public abstract void goBackward();


}
