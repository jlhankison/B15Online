package daily_classes.day005;

import java.util.Scanner;

public class AnnualWageCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many hours do you work a week? ");

            float weeklyHours = scan.nextFloat();

        System.out.print("How much do you make an hour? ");

            float hourlyRate = scan.nextFloat();

        float monthlySalary = hourlyRate *weeklyHours * 4;

        float annualSalary = monthlySalary * 12;

        System.out.println("You make $" + monthlySalary + " per month and $" + annualSalary + " per year." );


    }
}
