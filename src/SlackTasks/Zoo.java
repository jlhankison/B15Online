package SlackTasks;

import daily_classes.day048.Flyable;

public class Zoo {

    public static void main(String[] args) {

        Animals eagle1 = new Eagle("Baldy", 7, 9.5, 5.2);

        Eagle eagle2 = (Eagle) eagle1;

        eagle2.fly();

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception was caught");
        }

        Flyable eagle3 = new Eagle("Tim", 4, 6, 4.5);

        eagle3.fly();
    }
}
