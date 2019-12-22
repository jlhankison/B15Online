package daily_classes.day020;

public class FindTheDog {

    public static void main(String[] args) {

        String msg = "I like dogs, dogs' are cute, dogs are friendly";
        int dogCount = 0;

        for (int i = 0; i < msg.length()-3 ; i++) {
            String threeChar = msg.substring(i, i +3);
            if (threeChar.equalsIgnoreCase("dog")){
                dogCount++;
            }
        }
        System.out.println(dogCount);
    }
}
