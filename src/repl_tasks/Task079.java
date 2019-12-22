package repl_tasks;

import java.util.Scanner;

public class Task079 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        for (int i = 0; i < word.length(); i++) {
            if (! word.substring(i, i +1).equalsIgnoreCase("x") ){
                System.out.print(word.charAt(i));
            }
        }
    }
}
