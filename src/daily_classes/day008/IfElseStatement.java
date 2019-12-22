package daily_classes.day008;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 100 ;

        //if the yourCurrentSpeed is more than speed limit -->
        //get pulled over by the police
        //given ticket
        //points taken away from your license
        //go to court

        boolean amISpeeding = (yourCurrentSpeed > speedLimit);

        //if ( amISpeeding ) { // <-- this is a great way to declutter and keep the if statement simple
        //if ( true ) {
          if (yourCurrentSpeed > speedLimit){ // this is a perfectly acceptable way to enter an if statement but a bit more cluttered
            System.out.println("get pulled over by the police");
            System.out.println("given ticket");
            System.out.println("points taken away from your license");
            System.out.println("go to court");

        }else{
            System.out.println("go shopping");
            System.out.println("Buy Ice Cream");
            System.out.println("Enjoy your Day");
        }

        System.out.println("THE END");


        //if not over the limit
        //go shopping


    }
}
