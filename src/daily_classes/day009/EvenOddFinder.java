package daily_classes.day009;

public class EvenOddFinder {

    public static void main(String[] args) {

        int number;
        boolean isEven;

        number = 348;

        isEven = (number % 2) == 0;

        if (isEven) {

            System.out.println("This is an even number.");
        } else {

            System.out.println("This is an odd number.");
        }

    }

}
