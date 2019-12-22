package repl_tasks;

import java.util.Scanner;

public class Task103 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String steps = "";

        for (; i <= n; i++) {
            for (; j <= n; j++) {
                steps += "*";
                System.out.println(steps);
            }

        }
    }
}
