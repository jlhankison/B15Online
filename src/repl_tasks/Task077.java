package repl_tasks;

import java.util.Scanner;

public class Task077 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next(),
                firstName,
                lastName,
                domain,
                topLevelDomain;

        firstName = email.substring(0, email.indexOf("_"));
        lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        topLevelDomain = email.substring(email.indexOf(".")+1);

        System.out.println("First name: " + firstName.replaceFirst(firstName.substring(0,1), firstName.substring(0,1).toUpperCase()));
        System.out.println("Last name: " + lastName.replaceFirst(lastName.substring(0,1), lastName.substring(0,1).toUpperCase()));
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topLevelDomain);


    }
}
