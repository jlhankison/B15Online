package daily_classes.day049;

public class Burger implements Edible, Juicy {

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
}
