package daily_classes.day019;

public class ForLoopStaircase {

    public static void main(String[] args) {

        String staircase ="";
        String step = "|____";

        for (int i = 0; i < 20; i++) {
            System.out.print(staircase);
            System.out.println(step);
            staircase += "     " ;
        }
    }
}
