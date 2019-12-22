package repl_tasks;

import java.util.Scanner;

public class Task070 {
    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        String longWord = (word1.length()> word2.length()) ? word1 : word2;
        System.out.println(longWord);

    }
}
