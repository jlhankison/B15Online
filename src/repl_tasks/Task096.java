package repl_tasks;

import java.util.Scanner;

public class Task096 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        System.out.print(word);
        word = separator + word;
        for (int i = 0; i < count-1; i++) {
            System.out.print(word);
        }
    }
}
