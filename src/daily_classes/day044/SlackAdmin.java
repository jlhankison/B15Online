package daily_classes.day044;

public class SlackAdmin extends SlackUser{

    String  adminId;

    public SlackAdmin(String name, String status, String adminId) {
        this.adminId = adminId;
        this.name = name;
        this.status = status;
    }

    public void sendAtChannelMessage(String message){
        System.out.println("\"" + message + "\" - Message sent");
    }

    public void deleteMessage(String message){
        System.out.println("\"" + message + "\" - Message deleted");
    }

    public void addChannel(String channel){
        System.out.println(channel + " - channel added");
    }
}
