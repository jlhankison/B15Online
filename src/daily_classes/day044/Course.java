package daily_classes.day044;

public class Course {

    String name ;
    String type ;

    static int counter;

    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        // you can access static field
        // in constructor, instance method, static methods
        counter ++;
    }
}
