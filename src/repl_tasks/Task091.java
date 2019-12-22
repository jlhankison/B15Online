package repl_tasks;

public class Task091 {

    public static void main(String[] args) {

        char[] letters ={'z', 'y', 'x', 'w', 'v'};

        for (char letter1 : letters) {
            for (char letter2 : letters) {
                System.out.print(letter1);
                System.out.print(letter2);
            }

        }

    }
}
