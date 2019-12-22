package daily_classes.day023;

public class ForEachLoop {

    public static void main(String[] args) {

        double [] prices = { 99.23, 11.99, 100.23, 99.99, 56.34};

        for(double eachPrice : prices){
            System.out.println("eachPrice = " + eachPrice);

        }
    }
}
