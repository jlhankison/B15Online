package daily_classes.day016;

public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentance with 3 words
        //how do you get the second word?

        //steps:
        // find the word between the first and second space


        String sentence = "I love Java";
        String secondWord ;

        int firstSpaceIndex = sentence.indexOf(" ");

        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");

        System.out.println(sentence.substring(firstSpaceIndex+1, lastSpaceIndex));


    }
}
