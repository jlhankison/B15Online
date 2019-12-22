package Mentoring;

import java.util.Scanner;

public class Task036 {






            public static void main(String[] args) {
                //WRITE YOUR CODE HERE
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
                int seniorCitizens = scan.nextInt();
                int nonSeniorCitizens = scan.nextInt();

                System.out.println("What is new citizen's age?");
                int newCitizenAge = scan.nextInt();


                if (newCitizenAge >= 65){
                    seniorCitizens = seniorCitizens + 1;
                    System.out.println("Senior Citizen");
                }else {
                    nonSeniorCitizens = nonSeniorCitizens + 1;
                    System.out.println("Non-Senior Citizen");
                }

                System.out.println("New seniorCitizen Count " + seniorCitizens);
                System.out.println("New nonSeniorCitizen Count " + nonSeniorCitizens);










            }
        }

