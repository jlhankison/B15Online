package daily_classes.day048;

public class HourlyEmployee extends Employee {


    int hourlyWage;
    int numsOfHours;

    public HourlyEmployee (String name, int id, int hourlyWage, int numsOfHours){
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("Hourly Employee yearly salary = $" + (hourlyWage * numsOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Annual Salary='" + (hourlyWage*numsOfHours) +
                '}';
    }
}
