package daily_classes.day044.sub;

import daily_classes.day044.Vehicle;

public class Car extends Vehicle {

    int mileage ;

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.setYear(2016);

        c1.mileage = 102000;

        System.out.println("c1.mileage = " + c1.mileage);

        System.out.println("c1.getYear() = " + c1.getYear());
    }
}
