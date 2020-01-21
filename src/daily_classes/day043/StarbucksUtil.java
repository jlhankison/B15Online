package daily_classes.day043;

public class StarbucksUtil {

    public static void printCoffeeInfo (Coffee co){
        System.out.println("The drink type is: " + co.getType());
        System.out.println("The Caffeine level is: " + co.getCaffeineLevel());
        System.out.println("The price of this coffee is: " + co.getPrice());
    }
}
