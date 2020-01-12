package daily_classes.day039;

import java.util.ArrayList;
import java.util.Arrays;

public class Garage {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.manufacturer =  "Toyota";
        car1.model = "4 Runner";
        car1.year = 2020;
        car1.goForward();

        Car car2 = new Car();
        car2.manufacturer = "Tesla";
        car2.model = "Model X";
        car2.year = 2018;

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2));


        for (Car thisCar : cars) {
            thisCar.goForward();
            thisCar.printCarAge();
        }

    }
}
