package daily_classes.day052;

import daily_classes.day049.Shape;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public void draw() {

        System.out.println("Draw a Rectangle");
    }

}
