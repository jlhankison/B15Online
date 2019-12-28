package repl_tasks;

import java.util.Scanner;

public class Task128 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (double temp: temps) {
            total += temp;
        }
        avgTemp = total / temps.length;
        System.out.println(avgTemp);
}
}
