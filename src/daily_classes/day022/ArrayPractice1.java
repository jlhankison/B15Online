package daily_classes.day022;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices = new double[5];

        prices[0] = 2.48;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;

        for (int i = 0; i <= prices.length - 1; i++) {
            System.out.println(prices[i]);

        }

        char[] name = new char["Jordan".length()-1];

        name[0] = 'J';
        name[1] = 'o';
        name[2] = 'r';
        name[3] = 'd';
        name[4] = 'a';

        System.out.println(name);





    }
}
