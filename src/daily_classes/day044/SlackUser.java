package daily_classes.day044;

public class SlackUser {

    protected String name;
    protected String status;

    public void sendMessage (String recipient, String message){
        System.out.println("You sent - \"" + message + "\"");
        System.out.println("To user - " + recipient);
    }

    public void callSomeone (String recipient){

        System.out.println("Calling " + recipient + "...");
    }

    public void addEmoji (String message, String emoji){
        message += emoji;
        System.out.println(message);
    }
}
