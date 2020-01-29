package daily_classes.day048;

public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;

    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }
}
