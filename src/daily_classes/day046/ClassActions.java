package daily_classes.day046;

public class ClassActions {

    public static void main(String[] args) {

        SavingsAccount uWCU = new SavingsAccount("Jordan", 536985L, 12000, 5.6);

        System.out.println(uWCU);

        uWCU.withdraw(5000);

        System.out.println(uWCU);

        uWCU.deposit(1000);

        System.out.println(uWCU);

    }
}
