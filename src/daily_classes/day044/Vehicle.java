package daily_classes.day044;

public class Vehicle {

    String make;
    private int year;

    public void start(){
        System.out.println("Starting " + make);
    }

    public void goForward(){
        System.out.println(make + " is going forward");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
