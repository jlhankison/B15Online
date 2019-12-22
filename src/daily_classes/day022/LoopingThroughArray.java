package daily_classes.day022;

public class LoopingThroughArray {
    public static void main(String[] args) {


        int[] scores = new int[4];

        scores[0] = 54;
        scores[1] = 14;
        scores[2] = 28;
        scores[3] = -24;

        for (int i = scores.length -1 ; i >= 0; i-- ){
            System.out.println(scores[i]);

        }


    }
}
