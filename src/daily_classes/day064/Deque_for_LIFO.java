package daily_classes.day064;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        Deque<String> lifoQue = new LinkedList<>();

        lifoQue.add("Review the Class");
        lifoQue.add("do your homework");
        lifoQue.add("Attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("taskQueue = " + lifoQue);

        System.out.println("taskQueue.removeLast() = " + lifoQue.removeLast());
        System.out.println("taskQueue.removeLast() = " + lifoQue.removeLast());
        System.out.println("taskQueue.removeFirst() = " + lifoQue.removeFirst());
        System.out.println("taskQueue.removeFirst() = " + lifoQue.removeFirst());


        System.out.println("lifoQue = " + lifoQue);
    }
}
