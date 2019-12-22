package repl_tasks;

import java.util.Scanner;

public class Task108 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String stars = "";

        for (int k = 0; k < n; k++) {
            stars += "*";
            System.out.println(stars);
        }

    }
}
