package group_practice;

public class FibonacciSequence {

    public static void main(String[] args) {

        System.out.println("Fibonacci Sequence:");
        System.out.println("-------------------");

        long num1 = 1;
        long num2 = 1;
        long sum;
        int counter = 50;

        while (counter>= 0){
            sum = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = sum;
            counter--;


            if (counter % 10 == 0) {
                System.out.println("\n");
            }
        }

        }

    }

