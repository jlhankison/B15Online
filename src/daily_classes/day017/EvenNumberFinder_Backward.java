package daily_classes.day017;

public class EvenNumberFinder_Backward {

    public static void main(String[] args) {

        int count = 100;

        while (count > 0) {
            if (count % 2 == 0) {
                System.out.println("count = " + count + " <--even number");
            }
            --count;
        }
    }
}
