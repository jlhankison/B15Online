package daily_classes.day051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {


    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Pentagon();
        Shape s3 = new Square();
        Shape s4 = new Rectangle();
        Shape s5 = new Circle();


        List<Shape> lst = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        for (Shape each : lst) {
            each.draw();
        }
    }
}
