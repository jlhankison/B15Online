package daily_classes.day049;

public class Main  {


    public static void main(String[] args) {

        Tesla t1 = new Tesla("Tesla", 300, "X");
        Tesla t2 = new Tesla("Tesla", 145, "T");

        t1.start();
        t1.selfDrive();

        t2.start();
        t2.goForward();

        t1.chargeItem();

        t2.chargeItem();

        Shape s1 = new Square("Square 1", 15);

        Shape s2 = new Circle("Circle 1", 5);

        s1.calculateArea();
        System.out.println(s1.area);
        s1.draw();

        s2.calculateArea();
        System.out.println(s2.area);
        s2.draw();

        s2.sayHello();

        



    }

}
