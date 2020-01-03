package repl_tasks;

import java.util.Scanner;

public class Task135 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        /* type your code below */

        String[] newSentence = sentence.split(" ");

        for (String word : newSentence) {
            System.out.println(word);

        }
    }
}
