package repl_tasks;

import java.util.Scanner;

public class Task137 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] sentenceSplit = sentence.split(" ");

        for (int i = sentenceSplit.length - 1; i >= 0 ; i--) {
            System.out.println(sentenceSplit[i]);
        }
    }
}
