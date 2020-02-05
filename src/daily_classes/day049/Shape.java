package daily_classes.day049;

public abstract class Shape implements Drawable {

    public String name;
    public double area;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();





}
