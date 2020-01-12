package repl_tasks;

import java.util.Scanner;

public class Task162 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int fibNum  = 0,
                num1 = 1,
                num2;
        for (int i = 1; i <= num; i++) {
            num2 = fibNum + num1;
            num1 = fibNum;
            fibNum = num2;
        }
        System.out.println(fibNum);
    }
}
