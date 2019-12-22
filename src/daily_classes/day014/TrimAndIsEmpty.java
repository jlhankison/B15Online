package daily_classes.day014;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = "      REPL IS COMING  !!   ";
        System.out.println("message character count is " + message.length());

        System.out.println(message.trim());

        message = message.trim();
        System.out.println("message character count is " + message.length());


    }
}
