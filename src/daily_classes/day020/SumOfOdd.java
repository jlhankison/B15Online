package daily_classes.day020;

public class SumOfOdd {

    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;
        int oddCount = 0;
        int evenCount = 0;

        for (int x = 0; x < 100; x++) {
            if (x % 2 != 0) {
                sumOdd += x;
                oddCount ++ ;
            } else if (x % 2 == 0) {
                sumEven += x;
                evenCount ++;
            }
        }
        System.out.println(oddCount);
        System.out.println(sumOdd);
        System.out.println(evenCount);
        System.out.println(sumEven);
    }

}
