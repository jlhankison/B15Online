package daily_classes.day019;

public class CharCounter {
    public static void main(String[] args) {

        String name = "I believe in a thing called love! Just listen to the rhythm of my heart!";

        int lCounter = 0;

        for (int x = 0; x < name.length() ; x++) {

            char currentChar = name.charAt(x);

            if (currentChar == 'l'){
                lCounter ++;
            }
            
        }
        System.out.println("L count = " + lCounter);
    }
}
