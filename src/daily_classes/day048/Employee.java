package daily_classes.day048;

public abstract class Employee {

    String name;
    int id;

    public Employee(){

    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void calculateAnnualSalary ();

    public abstract String toString();


}
