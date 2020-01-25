package daily_classes.day046;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;
    String password = "";

    public BankAccount(String accountHolder, long accountNum, double balance) {
        super();
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void  setPassword(String origPass, String newPass){
        if (origPass.equals(this.password)){
            this.password = newPass;
        }else {
            System.out.println("Original password incorrect");
        }
    }


    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw ( double amount){

        balance -= amount;
    }


}
