package codingBatTasks;

public class BunnyEars2 {

    public static void main(String[] args) {

        for ( int i = 0; i < 10; i++ ) {
            System.out.println(bunnyEars2(i));
        }
    }

    public static int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return 0;
        } else {

            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        }
    }
}
