package group_practice;

import java.util.Scanner;

public class FacebookAccountCreation {

    public static void main(String[] args) {

        String firstName, lastName, password, password2, gender, email = "";
        boolean infoCorrect = false;
        long mobile;
        int birthYear, birthMonth, birthDay, currentYear = 2019;

        Scanner scan = new Scanner(System.in);

        /* outline
        print --> Welcome to Facebook! We're excited to get you signed up./n Just a few questions to get you started.\n\n
        print --> What is your first name?
            scan firstName
        print --> What is your last name?
            scan lastName

         */

        System.out.println("Welcome to Facebook!\nWe're excited to get you signed up.\nJust a few questions to get you started.\n");

        System.out.println("What is your first name?");
            firstName = scan.next();
        System.out.println("What is your last name?");
            lastName = scan.next();
//        ^^These are pretty basic, just getting first and last name.

        while (!infoCorrect) { //<-- This is a bit more complicated, it's an example of a "while" loop. which means that
                                //as long as the boolean "infoCorrect" = false ALL the following code will repeat.

            System.out.println("Please enter your phone number, if you want to enter your email instead, enter 0.");
                mobile = scan.nextLong(); //<-- I try to add an extra indent whenever I scan a value, I think it's a bit
                                            //easier to read

            if (mobile == 0) { //<-- First if statement to get the user's username, this was the first place I had to get
                                //creative. There ARE WAYS to convert a String into a Long but I don't know what they are
                                //without a bunch of googling and confusion.
                System.out.println("Alright, please enter your email:");
                    email = scan.next();

            } else {//<-- this part is tricky, I had to catch both the event of the user entering a number that was too
                    //high AND too low so I had to be a little redundant.
                    //If you guys know a way I could have done this more efficiently with the info we already know please
                    // tell me what you think!
                while (mobile > 9999999999L) { //<-- for if the user entered a number that was TOO HIGH first
                    System.out.println("Your mobile number isn't valid, try again:");
                        mobile = scan.nextLong();
                    while (mobile < 1000000000L) { //<-- for if the user entered a number that was TOO LOW second
                        System.out.println("Your mobile number isn't valid, try again:");
                            mobile = scan.nextLong();
                    }
                }
                while (mobile < 1000000000L) { //<-- for if the user entered a number that was TOO LOW first
                    System.out.println("Your mobile number isn't valid, try again:");
                        mobile = scan.nextLong();
                    while (mobile > 9999999999L) { //<-- for if the user entered a number that was TOO HIGH second
                        System.out.println("Your mobile number isn't valid, try again:");
                            mobile = scan.nextLong();
                    }
                }
            }

            System.out.println("What year were you born? YYYY");
                birthYear = scan.nextInt();

            if ((currentYear - birthYear) < 13) { //<-- A quick catch to make sure the user's age is over 13.
                                                    //I don't think we have the tools yet to effectively create a date
                                                    //comparison better than just years.
                System.out.println("Sorry, you have to be older than 13 to join Facebook");

            } else {//<-- The rest of the code fits within this else statement. If the user is determined to be underage
                    //the program will just end.

            System.out.println("What month were you born? MM");
                birthMonth = scan.nextInt();
            System.out.println("What day were you born? DD");
                birthDay = scan.nextInt();

            System.out.println("Please create a password:");
                password = scan.next();
            System.out.println("Please reenter your password:");
                password2 = scan.next();

                while (!password.equals(password2)) {//<-- Password confirmation, while String password and password2 DO NOT
                                                        //equal each other, the following code will repeat.
                    System.out.println("Those passwords do not match\nPlease create a password:");
                    password = scan.next();

                    System.out.println("Please reenter your password:");
                    password2 = scan.next();
                }

                System.out.println("Please enter your Gender:");
                gender = scan.next();

                System.out.println("Please review this information.");
                System.out.println("Name: " + firstName + " " + lastName);
                if (email.equals("")) {//<-- This checks if the user entered an email or mobile number as their userName
                                        //and prints out the associated value.
                    System.out.println("Username: " + mobile);
                } else {
                    System.out.println("Username: " + email);
                }
                System.out.println("Birthday: " + birthMonth + "/" + birthDay + "/" + birthYear);
                System.out.println("Gender: " + gender);

                System.out.println("If the above information is correct, please enter True, if not enter False:");
                    infoCorrect = scan.nextBoolean();

            }//end of age check else statement
        }// end of infoCorrect while statement
        System.out.println("Welcome to Facebook, " + firstName + "!");
    }


}