package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task170 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int[] temp = new int[inhabitants.length];
        int dayCount = 0,
                sum;


        do {
            sum = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                temp[i] = inhabitants[i];
            }
            System.out.println("Day " + dayCount + " " + Arrays.toString(inhabitants));
            dayCount++;
            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    if (temp[i] == 0) {
                        inhabitants[i + 1] = temp[i + 1] / 2;
                    }
                } else if (i == temp.length - 1) {
                    if (temp[i] == 0) {
                        inhabitants[i - 1] = temp[i - 1] / 2;
                    }
                } else if (temp[i] == 0) {
                    inhabitants[i - 1] = temp[i - 1] / 2;
                    inhabitants[i + 1] = temp[i + 1] / 2;
                }
                sum += temp[i];
            }
        }while (sum != 0) ;
            System.out.println("---- EXTINCT ----");


    }
}

