package daily_classes.day021;

public class TwoAndThreeCharAtATime {

    public static void main(String[] args) {

        String word = "come on Barbie, let's go party";

        int length = word.length();


        for (int x = 0; x <= length - 2; x+= 2) {
            System.out.print(word.substring(x , x + 2) + "->");
        }
        System.out.println();
        for (int y = 0; y <= length - 3; y+= 3) {
            System.out.print(word.substring(y , y + 3) + "->");

        }
    }
}
