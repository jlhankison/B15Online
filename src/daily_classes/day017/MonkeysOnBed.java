package daily_classes.day017;

public class MonkeysOnBed {
    public static void main(String[] args) {


        int monkeys = 5;

        while (monkeys>=0){
            String phrase = monkeys+ " little monkey's jumping on the bed, one fell off and bumped his head";

            switch (monkeys){
                case (1):
                    phrase = phrase.replace("'s", "");
                    break;
                case (0):
                    phrase = "NO MORE MONKEY'S JUMPING ON THE BED!";
                    break;
            }
            System.out.println(phrase);
            --monkeys;

        }
    }
}

