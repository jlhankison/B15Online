package daily_classes.day031;

public class OneMethodInsideAnother {

    public static void coffeeUp(){

        DailyRoutine.wakeUp();

        System.out.println();

        DailyRoutine.drinkCoffee();
    }
}
