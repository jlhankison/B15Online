package daily_classes.day021;

public class LoopControlStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if( i == 5){
                break;
            }
        }
        int sum = 0;
        for (int i = 1  ; i < 10; i++) {

            sum += i;

            if (sum > 40) {
                sum -= i;
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
