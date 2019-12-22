package daily_classes.day012;

public class Task3 {

    public static void main(String[] args) {

        int num = 29;

        if (num%5 == 0 && num%3 == 0){
            System.out.println("FizzBuzz Number");
        }else if (num%5 == 0){
            System.out.println("Fizz Number!");
        }else if (num%3 == 0 ){
            System.out.println("Buzz Number!");
        }else{
            System.out.println("Neither Fizz nor Buzz number");
        }
    }
}
