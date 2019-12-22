package daily_classes.day022;

public class WarmUpTask1_CanvasLinks {

    public static void main(String[] args) {


        for (int x = 17; x <= 52; x++) {
            String linkTemplate = "https://learn.cybertekschool.com/courses/278/modules#33";

            linkTemplate += x;
            System.out.println("This will lead you to day " + (x + 4));
            System.out.println(linkTemplate);

        }


    }
}
