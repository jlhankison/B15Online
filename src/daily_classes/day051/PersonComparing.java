package daily_classes.day051;

import java.util.*;

public class PersonComparing {

    public static void main(String[] args) {


        Person p1 = new Person("Jordan", 28);

        Person p2 = new Person("Rich", 35);

        Person p3 = new Person("Greg", 28);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        List<Person> lst = new ArrayList<>(Arrays.asList(p1,p2, p3));

        lst.add(new Person ("John Snow", 27));





//        if (p1.age>p2.age){
////            System.out.println("1");
////        }else if ( p2.age > p1.age){
////            System.out.println("-1");
////        }else{
////            System.out.println("0");
////        }

    }
}
