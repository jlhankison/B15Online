package group_practice;

import java.util.Scanner;

public class FibonacciTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many places you wish to calculate:");
        int size = scan.nextInt();

        long x = 0,
                y = 1,
                sum = 1,
                startY = 0,
                startX = 0,
                startSum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", sum);
                if (j == 1) {
                    startX = x;
                    startY = y;
                    startSum = sum;
                }

                sum = x + y;
                x = y;
                y = sum;

            }
            System.out.println();

            x = startX;
            y = startY;
            sum = startSum;
        }
    }
}
