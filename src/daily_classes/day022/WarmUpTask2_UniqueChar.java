package daily_classes.day022;

public class WarmUpTask2_UniqueChar {

    public static void main(String[] args) {

        String sequence = "bbbbbuuuuubbbbttttbbuuuuhhhhoobbbbbbbllllttteee";

        String uniqueChar = "";

        for (int x = 0; x < sequence.length(); x++) {

            if (! uniqueChar.contains(sequence.substring(x , x+1))){
                uniqueChar += sequence.substring(x,x+1);

            }

        }
        System.out.println(uniqueChar);
    }
}
