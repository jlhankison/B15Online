package daily_classes.day021;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

        String name = "Jordan is my name, my name is Jordan",
                newName = "";

        int lastCharIndex = name.length() - 1;

        for (int i = 0; i <= lastCharIndex -2; i++)
            if (i == lastCharIndex - 2) {
                newName += (name.substring(i,i+3));
            } else {
                newName += (name.substring(i, i+3) + "->");

            }


        System.out.println(newName);
    }

}
