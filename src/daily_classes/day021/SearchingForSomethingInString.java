package daily_classes.day021;

public class SearchingForSomethingInString {
    public static void main(String[] args) {

        String name = "Daria Ozer";

        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount -1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        System.out.println("-----begin program-----");

        System.out.println("Indexes of 'a':");
        for (int i = 0; i <= lastCharIndex; i++) {

            if (name.substring(i, i+1).equalsIgnoreCase("a")) {
                System.out.print(i + ",");
            }
        }
    }
}
