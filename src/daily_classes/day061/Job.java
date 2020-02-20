package daily_classes.day061;

public class Job implements Comparable<Job> {

    public String location;

    public int salary;

    public String companyName;

    public Job(String location, int salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Job o) {
        if (this.salary > o.salary){
            return -1;
        }else if( this.salary == o.salary){
            return 0;
        }else{
            return 1;
        }
    }
}
