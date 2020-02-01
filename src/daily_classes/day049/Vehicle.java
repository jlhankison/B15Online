package daily_classes.day049;

public abstract class Vehicle implements Autonomous {

    String brand;

    public Vehicle (String brand){
        this.brand = brand;
    }

    public abstract void start ();

    public void goForward(){
        System.out.println(brand + " goes forward");
    }
}
