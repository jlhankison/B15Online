package daily_classes.day039;

/**
 * This class defines the attributes of a car and stores them as an Object
 *
 */
public class Car {


    String manufacturer;
    String model;
    String type;
    double price;
    int year;
    int mileage;

    //instance methods are tied to the object
    //it does not have the static keyword
    //we need an object when we call them
    public void goForward(){
        System.out.println(model + " going forward");
    }
    public void printCarAge(){
        int age = 2020 - year;
        System.out.println(model + " is " + age + " year(s) old.");
    }
}
