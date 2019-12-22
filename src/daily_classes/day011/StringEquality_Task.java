package daily_classes.day011;

import java.util.Scanner;

public class StringEquality_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite word?");
        String myStr = scan.next();

        if (myStr.equals("Java")){
            System.out.println("Correct Word!");

        }else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin!");
        }
        else{
            System.out.println("Say Java or Cava!");
        }

    }
}
