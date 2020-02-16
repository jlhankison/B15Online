package SlackTasks;

import daily_classes.day048.Flyable;

public class Eagle extends Animals implements Flyable {

    double wingspan;

    public Eagle(String name, int age, double weight, double wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }

    @Override
    public void move() {
        System.out.println(name + " the Eagle, flaps it's wings...");
    }

    @Override
    public void makeNoise() {
        System.out.println("SCREECH!");
    }

    @Override
    public void fly() {
        System.out.println(name + " the Eagle is flying...");
    }
    public void getWingspan(){
        System.out.println(wingspan);
    }
}
