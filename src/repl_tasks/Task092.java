package repl_tasks;

import java.util.Scanner;

public class Task092 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long num = n;

        for (int i = n-1; i >= 1; i--) {

            num *= i;

        }
        System.out.println(num);
    }
}
