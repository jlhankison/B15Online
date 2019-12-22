package repl_tasks;

import java.util.Scanner;

public class Task068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String word = scan.nextLine();

        System.out.println(sentence.contains(word));
    }
}
