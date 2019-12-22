package daily_classes.day004;

public class FtoCConverter {

    public static void main(String[] args) {


        double farenheit = 65d;

        double celsius;

        double conversion = (5.0f/9) * (farenheit - 32);

        celsius = conversion;

        System.out.println(farenheit + " degrees in Farenheit = " + celsius + " degrees in celsius.");

    }
}
