package daily_classes.day015;

public class ReplaceMethod {

    public static void main(String[] args) {
        
        //Replace method of String
        
        String message = "I love Pumpkin, Pumpkin IS FUN";
        
        //I want to replace "Pumpkin" with "Java"
        message.replace("Pumpkin", "Java");

        System.out.println("message = " + message);

        System.out.println(message.replace("Pumpkin", "Java"));

        String message2 = "Happy Thanks Giving to All!!";

        System.out.println("message2 = " + message2);

        String correctedMessage2 = message2.replace("Thanks Giving" , "Thanksgiving");

        System.out.println("correctedMessage2 = " + correctedMessage2);

        System.out.println(correctedMessage2.replace(" ", ""));
    }
}
