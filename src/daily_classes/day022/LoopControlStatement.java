package daily_classes.day022;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg = "Come on Barbie, let's go party! ah ah ah yeah!";
        int aCounter = 0;

        for (int x = 0; x < msg.length(); x++) {

            if(msg.charAt(x) == 'a'){
                aCounter++;
            }
            if (aCounter == 3) {
                break;
            }
            if (x % 2 == 0) {
                continue;
            }
            System.out.print(msg.charAt(x));


        }
    }
}
