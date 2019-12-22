package repl_tasks;

import java.util.Scanner;

public class Task078 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender = "Sender: " + message.substring(message.indexOf("<")+1, message.indexOf(">"));
        phoneNumber = "Phone Number: " + message.substring(message.indexOf("[")+1, message.indexOf("]"));
        messageBody = "Message body: " + message.substring(message.indexOf("{")+1, message.indexOf("}"));

        System.out.println(sender);
        System.out.println(phoneNumber);
        System.out.println(messageBody);
    }
}
