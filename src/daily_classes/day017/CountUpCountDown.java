package daily_classes.day017;

public class CountUpCountDown {

    public static void main(String[] args) {

        int count = 5;

        while (count>0){
            System.out.println("count = " + count);
            --count;
        }
        System.out.println("--------------");
        while (count<=5){
            System.out.println("count = " + count);
            ++count;
        }
    }
}
