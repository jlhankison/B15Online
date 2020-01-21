package daily_classes.day044;

public class CourseCreator {

    public static void main(String[] args) {

        System.out.println("Course.counter = " + Course.counter);


        Course c1 = new Course("Java", "Foundation");
        Course c2 = new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservices");
        Course c5 = new Course("Agile", "Soft Skills");

        System.out.println("Course.counter = " + Course.counter);




    }
}
