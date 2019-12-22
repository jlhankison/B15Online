package daily_classes.day017;


import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your name:");
            String name = scan.nextLine().toLowerCase();
            String nameReversed = "";

            int nameIndex = name.length() - 1;

            while (0 <= nameIndex) {
                nameReversed = nameReversed + name.charAt(nameIndex);
                --nameIndex;
            }
            String firstName = "";

            if (nameReversed.contains(" ")) {
                firstName = firstName.substring(0, 1).toUpperCase() + nameReversed.substring(1, nameReversed.indexOf(" "));
                String lastName = nameReversed.substring(nameReversed.indexOf(" ") + 1);
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

                System.out.println("Name Reversed  = " + firstName + " " + lastName);
            }else{
                firstName = nameReversed.substring(0,1).toUpperCase() + nameReversed.substring(1);
                System.out.println("Name Reversed = " + firstName);
            }


        }
    }
}
