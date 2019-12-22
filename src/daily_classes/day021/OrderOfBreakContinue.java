package daily_classes.day021;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            System.out.println("hello");
            continue;  //<-- this does nothing. when continue is at the end of the loop statement, it will continue the loop as normal
        }
        System.out.println("The End");
    }
}
