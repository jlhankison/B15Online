package daily_classes.day049;

public interface Drawable {

    public void draw();

    default void example(){
        System.out.println("Enter your own code here");
    }

    static void onePlusOne (){
        System.out.println("2");
    }

}
