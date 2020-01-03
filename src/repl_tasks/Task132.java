package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task132 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 0; i < score.length ; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = input.nextFloat();
        }
        Arrays.sort(score);
        score[0] = 0;
        score[score.length -1] = 0;

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat(),
                sum = 0f,
                total = 0f;

        for (float currentScore : score) {
            sum += currentScore;
        }
        sum *= difficulty;
        total = sum * .6f;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
