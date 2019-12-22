package daily_classes.day021;

public class DecidingWhenToStop {

    public static void main(String[] args) {

        String msg = "Come on Barbie, let's go party";

        int length = msg.length(),
                n = 4;

        for (int x = 0; x <= length - n; x+= n) {
            System.out.println(msg.substring(x, x + n));

        }
    }
}
