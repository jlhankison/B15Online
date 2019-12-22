package daily_classes.day023;

public class WarmUp_Array {

    public static void main(String[] args) {

        int [] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i) * i + 9 ;

        }
        int lastItem = 0,
                middleItem = 0,
                sum = 0,
                average = 0,
                max = 0,
                min = numbers[6];

        for (int x = 0; x < numbers.length; x ++) {

            sum += numbers[x];
            average = sum / numbers.length;

            if (numbers[x] > max) {
                max = numbers[x];
            }
            if (numbers[x] < min) {
                min = numbers[x];
            }

            if (x == numbers.length - 1) {
                lastItem = numbers[x];
                System.out.println(numbers[x]);
            } else if (x == numbers.length / 2) {
                middleItem = numbers[x];
            } else {
                System.out.print(numbers[x] + ", ");
            }
        }
        System.out.println("lastItem = " + lastItem);
        System.out.println("middleItem = " + middleItem);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

