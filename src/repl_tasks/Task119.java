package repl_tasks;

import java.util.Scanner;

public class Task119 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();


        //Write your code below
        int counter = 0;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                counter ++;
            }
        }

        if (counter == 1){
            String[] emailSplit = email.split("@");
            System.out.println("Email id: " + emailSplit[0]);
            System.out.println("Email domain: " + emailSplit[1]);
        }else{
            System.out.println("invalid email");
        }
    }
}
