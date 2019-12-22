package repl_tasks;

import java.util.Scanner;

public class Task099 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        int count = 0;
        String prefix = str.substring(0, n);

        for (int i = 0; i < str.length() - prefix.length() + 1; i++) {
            if (str.substring(i, i + prefix.length()).equals(prefix)){
                count ++;
            }
        }
        if(count == n) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
