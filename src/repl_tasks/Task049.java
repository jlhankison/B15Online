package repl_tasks;

import java.util.Scanner;

public class Task049 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();

        //your code here

        if (grade > 90) {
            System.out.println("excellent");
        }else if (grade > 70) {
            System.out.println("good");
        }if (grade > 60) {
            System.out.println("pass");
        }if (grade < 60) {
            System.out.println("fail");
        }
    }
}
