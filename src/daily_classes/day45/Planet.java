package daily_classes.day45;

public class Planet extends Object{

    double gravity;
    int radius;
    boolean hasLife;

    public Planet() {
    }

    public Planet(double gravity, int radius, boolean hasLife) {
        this.gravity = gravity;
        this.radius = radius;
        this.hasLife = hasLife;
    }
}
