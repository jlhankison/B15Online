package daily_classes.day016;

public class WarmUp_WordReverse {

    public static void main(String[] args) {

        String word1 = "Butt";
        String word2 = "";
        System.out.println("word1 = " + word1);
        int wordLength = word1.length();

        word2 =  ("" + word1.charAt(wordLength-1) + word1.charAt(wordLength-2)+ word1.charAt(wordLength-3) + word1.charAt(wordLength-4));

        System.out.println("word2 = " + word2);
    }
}
