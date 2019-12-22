package daily_classes.day016;

public class FirstLastWordAcquire {

    public static void main(String[] args) {

        
        String sentence = "See Jane run";
        System.out.println("sentence = " + sentence);
        
        int firstSpaceIndex = sentence.indexOf(" ");
        
        String firstWord = sentence.substring(0, firstSpaceIndex);

        System.out.println("firstWord = " + firstWord);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        int stringLength = sentence.length();

        String lastWord = sentence.substring(lastSpaceIndex+1, stringLength);
        System.out.println("lastWord = " + lastWord);
    }
}
