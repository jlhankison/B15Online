package repl_tasks;

import java.util.Scanner;

public class Task172 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;

        int count = matrix[0].length -1;

        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];
            result -= matrix[i][count];
            count --;
        }

        // FINAL PRINT
        System.out.println(Math.abs(result));

    }
}
