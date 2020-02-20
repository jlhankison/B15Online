package daily_classes.day061;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {
        
        List<Job> lst = new LinkedList<>();
        
        lst.add(new Job("Sacramento", 103000, "Value Associates"));
        lst.add(new Job("Milwaukee", 95000 , "Milwaukee Bucks"));
        lst.add(new Job("Madison", 83000, "Epic"));
        lst.add(new Job("DC", 120000, "Eric's Electric"));
        lst.add(new Job("Milwaukee",140000 , "Warren Election Commission"));

        System.out.println("lst = " + lst);
        
        List<Job> jobList = new LinkedList<>(lst);

        Collections.sort(jobList);

        System.out.println("jobList = " + jobList);
        
    }
}
