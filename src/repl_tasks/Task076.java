package repl_tasks;

import java.util.Scanner;

public class Task076 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_")),
                    lastName = email.substring(email.indexOf("_") + 1 , email.indexOf("@")),
                    newEmail = email.replace(lastName, firstName);
                    newEmail = newEmail.replaceFirst(firstName, lastName);

            System.out.println(newEmail);
        }else{
            System.out.println(email);
        }
    }
}
