package repl_tasks;

import java.util.Scanner;

public class Task125 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] strs = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortest = strs[0];
        for (String str : strs) {
            if(str.length() < shortest.length() )
                shortest = str;

        }
        System.out.println(shortest);
    }
}
