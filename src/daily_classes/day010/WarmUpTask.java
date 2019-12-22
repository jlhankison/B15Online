package daily_classes.day010;

public class WarmUpTask {
    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 45;

        if ( myNumber % 5 ==0){
            myAnswer = "fizz Number";


        }else {
            myAnswer = "not a Fizz Number";
        }

        System.out.println(myNumber + " is " + myAnswer);
    }
}
