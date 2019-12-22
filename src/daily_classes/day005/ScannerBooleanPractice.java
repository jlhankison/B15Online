package daily_classes.day005;
//Importing the scanner from JDK
import java.util.Scanner;

public class ScannerBooleanPractice {

    public static void main(String[] args) {
        //Creating Scanner object
        Scanner userInput = new Scanner (System.in);

        //Ask user a question

        System.out.println("Are you recording? ");

            //userInput is prompted for user to type an input
            boolean isRecording = userInput.nextBoolean();

            //the result of concatenating a STRING to ANY DATA TYPE  = STRING
        System.out.println("Recording = " + isRecording);




    }
}
