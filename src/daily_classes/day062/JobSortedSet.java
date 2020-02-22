package daily_classes.day062;

import com.sun.source.util.Trees;
import daily_classes.day061.Job;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobSortedSet {
    public static void main(String[] args) {


        SortedSet<Job> sortedJobs = new TreeSet<>();

        sortedJobs.add(new Job("Ohio", 145000, "Scranton"));
        sortedJobs.add(new Job("Wisconsin", 105000, "Fieser Forum"));
        sortedJobs.addAll(Arrays.asList(new Job("Hawaii", 200000, "Beach Bum"),
                new Job("Atlantis", 150000, "Coverup CO."),
                new Job("Atlantis", 150000, "Coverup CO")));

        System.out.println("sortedJobs = " + sortedJobs);

        System.out.println(sortedJobs.first());
        System.out.println(sortedJobs.last());

    }

}
