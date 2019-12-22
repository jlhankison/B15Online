package repl_tasks;

import java.util.Scanner;

public class Task036 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizens = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if (age >= 65) {
            System.out.println("Senior Citizen");
            seniorCitizens ++;
        }else{
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens ++;
        }

        System.out.println("New seniorCitizens count " +seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
    }

}
