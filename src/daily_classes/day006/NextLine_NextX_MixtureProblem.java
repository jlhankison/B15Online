package daily_classes.day006;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your name? ");
            String name = userInput.nextLine();
        System.out.println("You entered: " + name);


        System.out.print("What is your age? ");
        int age = userInput.nextInt();          // <-- Both will output the numbers, only int will output a calculable number
        //String age = userInput.nextLine();    // <-- Both will output the numbers, only int will output a calculable number

        //notice we are not storing userInput into a variable
        // we just want the below line to capture ENTER keyboard input
        //so that it dos not accidentally get captured by the nextLine we used to capture address
            //example ( if you entered "28 bla bla" for last userInput the output will be "age = 28 address = bla bla")
            //example cont. (adding a new .nextLine(); prevents the overflow information ("bla bla") from being input to the next userInput)
        userInput.nextLine();

        System.out.println("You entered: " + age);

        System.out.println("What is your address: ");
        String address = userInput.nextLine();
        System.out.println("You entered: " + address);


    }
}
