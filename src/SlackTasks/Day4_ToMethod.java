package SlackTasks;

public class Day4_ToMethod {

    public static void amazonProductInfo (String name , String model , int version , float price){

        System.out.println("I saw " +
                name + " " +
                model + " " +
                version + " for $" +
                price);
    }
    public static void fahrenheitToCelsius(double fahrenheit){

        double celsius;

        celsius = (5.0/ 9) * (fahrenheit - 32);

        System.out.println(fahrenheit + "F equals " +
                celsius + "C");
    }
}
