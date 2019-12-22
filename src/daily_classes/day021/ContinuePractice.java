package daily_classes.day021;

public class ContinuePractice {
    public static void main(String[] args) {

        String sentence = "Come on Barbie, let's go party";

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) == 'o'){
                continue;
            }
            System.out.print(sentence.charAt(i));

        }
    }
}
