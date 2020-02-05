package daily_classes.day051;

public abstract class Shape {

    public  abstract void draw();

    public static String shapeType (Shape anyShape){
        return anyShape.getClass().getSimpleName();

    }
}

class Triangle extends Shape{

    public void draw(){
        System.out.println("Drawing a Triangle");
    }
}

class Rectangle extends Shape{

    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class Square extends Shape{

    public void draw(){
        System.out.println("Drawing a Square");
    }
}

class Circle extends Shape{

    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Pentagon extends Shape{

    public void draw(){
        System.out.println("Drawing a Pentagon");
    }
}