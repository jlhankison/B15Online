package repl_tasks;

import java.util.Scanner;

public class Task065 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        for (int i = 0; i < 1; i++) {
            System.out.print(word1);
            for (int x = 0; x < 2; x++) {
                System.out.print(word2);
            }
            System.out.println(word1);

        }
    }
}
