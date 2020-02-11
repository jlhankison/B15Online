package daily_classes.day056;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("NO ARG CONSTRUCTOR BEING CALLED!!");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("We already have this object");
        }

        return instance;

    }
}
