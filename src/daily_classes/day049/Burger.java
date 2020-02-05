package daily_classes.day049;

import daily_classes.day052.Time;

public class Burger implements Edible, Juicy, Time {

    private String burgerType;

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    @Override
    public void eat() {
        System.out.println("Take a big bite of your " + burgerType + " burger!");
    }

    @Override
    public void drink() {
        System.out.println("You have to have something to drink with your burger");
    }

    @Override
    public void melt() {
        System.out.println("The burger melts in your mouth with juices");
    }

    @Override
    public double CreationTimeStamp() {


        return 927;
    }

    @Override
    public double timeToRun() {
        return 0;
    }
}
