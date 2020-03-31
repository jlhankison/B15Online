package codingBatTasks;

public class FibonacciRecursion {

    public static void main(String[] args) {


    }


    public static int fibonacci(int n) {

        int x = n;

        if (n == 1) {
            return 0;
        }

        return n = n + fibonacci(n - 1);
    }
}
