package daily_classes.day046;

public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }

    public void withdraw (double amount){
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * (interestRate/100));
    }
}
