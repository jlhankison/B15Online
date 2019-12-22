package daily_classes.day017;

public class SkipCounting_Five {

    public static void main(String[] args) {
        
        int counter = 0;

        while (counter < 50) {
            counter += 5;
            if (counter%2 ==0) {
                System.out.println("counter = " + counter + " <--even number");
            }else {
                System.out.println("counter = " + counter);
            }
        }
        System.out.println("------------");
        while (counter > 0) {
            counter -= 2;
            if (counter % 3 == 0 && counter % 8 ==0) {
                System.out.println("counter = " + counter + " <--divisible by 3 and 8");
            }else if (counter % 8 == 0){
                System.out.println("counter = " + counter + "<--divisible by 8");
            }else if (counter%3 ==0){
                System.out.println("counter = " + counter + "<--divisible by 3");
            }

        }
    }
}
