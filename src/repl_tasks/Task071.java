package repl_tasks;

public class Task071 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 100; i++) {
            if (i % 2 == 0 && i != 100 ) {
                System.out.print(i + ",");
            }else if ( i == 100) {
                System.out.print(i);
            }
        }
    }
}
