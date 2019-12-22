package daily_classes.day019;

public class SumOfAllNumbersWithinARange {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 10 ; i++) {

            sum += i;
            System.out.println((sum-i) + " + " + i + " = " + sum);

        }
    }
}
