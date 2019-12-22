package daily_classes.day031;

public class Voting {

    public static void Eligibility(int age) {

        if (age >= 18){

            System.out.println("Person is old enough to vote!");
        }else if (age >= 0){
            System.out.println("Person is not old enough to vote!");
        }else{
            System.out.println("...You can't be a negative age, unless you're a demon lord");
        }
    }
}
