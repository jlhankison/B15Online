package daily_classes.day044;

public class SlackAction {

    public static void main(String[] args) {

        SlackAdmin admin = new SlackAdmin("Akbar", "Online", "53f938");

        admin.addChannel("French Speakers");
        admin.sendAtChannelMessage("Stop speaking French!");
        admin.deleteMessage("Stop speaking French!");

        SlackUser user1 = new SlackUser();

        user1.name = "Jordan";
        user1.status = "Online";

        user1.addEmoji("OMG, my BFF Jill ", ":O");
        user1.callSomeone("Eli");
        user1.sendMessage("Michael", "Sup, bud?");
    }
}
