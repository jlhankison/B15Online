package daily_classes.day049;

public class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = radius * Math.PI;
    }

    public void draw(){

    }


}
