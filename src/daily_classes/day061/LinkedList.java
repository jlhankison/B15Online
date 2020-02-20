package daily_classes.day061;

import java.util.Arrays;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {

        List<String> lst = new java.util.LinkedList<>(Arrays.asList("Zeynep", "Ershat", "Kamira", "Sabira"));

        System.out.println("lst = " + lst);

        lst.remove("Kamira");

        System.out.println("lst = " + lst);



    }
}
