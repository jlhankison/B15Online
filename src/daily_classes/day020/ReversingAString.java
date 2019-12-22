package daily_classes.day020;

public class ReversingAString {

    public static void main(String[] args) {

        String word = "Eva Can I Stab Bats In A Cave";
        String newWord = "";


        for (int x = word.length()- 1; x >= 0; x--) {

            newWord += word.charAt(x);
        }

        if (newWord.replace(" ","").equalsIgnoreCase(word.replace(" ", ""))){
            System.out.println(word +" is a palindrome");
        }else {
            System.out.println(newWord);
        }
    }
}
