package daily_classes.day023;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        long [] salaries = {90000L, 95000L, 100000L, 105000L, 110000L};
        long preferredSalary = salaries[0];

        System.out.println("Salary options:");
        for(long currentSalary : salaries){
            System.out.println("$" + currentSalary);
            if (currentSalary> preferredSalary) {
                preferredSalary = currentSalary;
            }
        }
        System.out.println("My Preferred salary: $" + preferredSalary);


    }
}
