package daily_classes.day052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookTask {

    public static void main(String[] args) {

//        Book b1 = new PaperBook("Lord of the Rings", "JRR Tolkien", 12);
//        Book b2 = new AudioBook("The Name of the Wind", "Patrick Rothfus", 28.32);
//        Book b3 = new AudioBook("Eye of the World", "Robert Jordan", 39.12);
//        Book b4 = new AudioBook("Cat in the Hat", "Dr. Seuse", .32);
//        Book b5 = new AudioBook("Outsider in the White House", "Bernie Sanders", 18.12);
//        Book b6 = new AudioBook("Drop Out", "Garry Furtive", 28.32);
//        Book b7 = new AudioBook("Next Door", "Alan Gray", 13.12);
//
//        List<Book> lst = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5,b6,b7));
//
//        int count = 0;
//        for (Book each : lst) {
//            each.displayBookInfo();
//
//            if (each.getClass().getSimpleName().equals("PaperBook")) {
//                count ++;
//            }
//
//        }
//        System.out.println("count of paper books = " + count);

        Book b8 = new PaperBook("Java for Dummies", "Dr. Seus", 10);
        Book b9 = new PaperBook("Java for Dummies V2", "PHD Seus", 10, 100);


        System.out.println(b8.toString());
        System.out.println(b9.toString());


    }
}
