package daily_classes.day031;

public class SeasonChecker {

    public static void decideSeasonAction(String season){

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Summer is coming!" );
            System.out.println("Let's frolic in wild flowers");
        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("Fall is coming!");
            System.out.println("Let's go skinny dipping in the lake!");
        }else if (season.equalsIgnoreCase("fall")){
            System.out.println("Winter is coming! - Ned Stark");
            System.out.println("Spiced lattes and pumpkin's abound!");
        }else if (season.equalsIgnoreCase("Winter")){
            System.out.println("Spring is coming!");
            System.out.println("Time to get cozy, and eat some comfort food");
        }else{
            System.out.println("invalid season");
        }
    }
}
