package daily_classes.day049;

public interface Edible {

    boolean isHumanFood = true;

    void eat();
    void drink();

    public default void digest(){

        System.out.println("TODO: YOU IMPLEMENT digest METHOD YOURSELF");
    }
}
