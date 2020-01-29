package daily_classes.day048;

public class FullTimeEmployee extends Employee {

    int monthlySalary;

    public FullTimeEmployee (String name, int id, int monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Employee Annual Salary = $" + (monthlySalary*12));
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", Annual Salary=" + (monthlySalary*12) +
                '}';
    }
}
