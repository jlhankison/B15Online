package codingBatTasks;

public class Test {

    public static void main(String[] args) {
        System.out.println(count8(8808));
    }

    public static int count8(int n) {

        if (n % 100 == 88) {
            return 3 + count8(n / 100);
        } else if (n == 8) {
            return 1;
        } else if (n < 10) {
            return 0;
        } else {
            return count8(n % 10) + count8(n / 10);
        }
    }
}
