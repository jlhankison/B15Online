package daily_classes.day018;

public class ForLoop_EvenNumber {

    public static void main(String[] args) {

        for (int i = 1, x = 0, sum ; i <= 144 ; sum = i + (x = (i = x + i))){
            System.out.println(x);
        }

        // sum = x + i
        // x = i
        // i = sum
        }
    }

