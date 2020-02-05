package daily_classes.day052;

import daily_classes.day049.Shape;

public class Square extends Shape {

    double lengthOfSide;

    public Square(String name, double lengthOfSide){
        super(name);
        this.lengthOfSide = lengthOfSide;
    }

    public void calculateArea(){
        area = lengthOfSide * lengthOfSide;
    }

    public void draw(){
        System.out.println("Draw your " + area + " sized " + name);
    }
}
