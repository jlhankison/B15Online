package daily_classes.day064;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueInterfaceDemo {


    public static void main(String[] args) {


        Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("Review the Class");
        taskQueue.add("do your homework");
        taskQueue.add("Attend the class");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);


        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());


    }
}
