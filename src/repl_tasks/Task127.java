package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task127 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int day = 0,
                total = 0;

        do {
            System.out.print("Day " + day + " ");
            System.out.println(Arrays.toString(inhabitants));
            day ++;
            total = 0;
            for (int j = 0; j < inhabitants.length; j++) {
                inhabitants[j] /= 2;
                total += inhabitants[j];
            }
        }while (total != 0);
        System.out.println(Arrays.toString(inhabitants));
            System.out.println("---- EXTINCT ----");

    }
}
