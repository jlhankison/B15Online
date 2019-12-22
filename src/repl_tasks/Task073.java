package repl_tasks;

import java.util.Scanner;

public class Task073 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int lastCharIndex = word.length()-1;

        if (word.length()>=  5 && word.length()%2 ==1) {
            System.out.println(word.substring(lastCharIndex/2-1, lastCharIndex/2 + 2));
        }
        else{
            System.out.println("invalid");
        }
    }
}
