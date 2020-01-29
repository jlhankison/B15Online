package daily_classes.day048;

import java.lang.reflect.Array;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Jordan", 104013, 3000);

        e1.calculateAnnualSalary();

        System.out.println(e1.toString());


        e1 = new HourlyEmployee("Jordan", 104013, 55, 2080);

        e1.calculateAnnualSalary();

        System.out.println(e1.toString());

        Employee e2 = new FullTimeEmployee("Akbar", 103, 10000);

        Employee e3 = new HourlyEmployee("Muge", 104, 60, 2000);

        List<Employee> employees = Arrays.asList(e1, e2, e3);

        for (Employee x : employees) {
            System.out.println("Name is = " + x.name);
            x.calculateAnnualSalary();
        }

    }




}
