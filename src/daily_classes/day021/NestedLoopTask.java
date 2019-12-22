package daily_classes.day021;

public class NestedLoopTask {
    public static void main(String[] args) {
        //count from 1 - 10
        //only odd numbers
        //repeat this 4 times

        for (int y = 1; y <= 4; y++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

    }


}
