package daily_classes.day021;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 0; x <= 100; x++) {


            if (x % 5 == 0) {
                System.out.println("skipping " + x);
                continue;
            }
            System.out.println(x);


        }


    }
}
