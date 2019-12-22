package Methods;

public class DistanceBetween {

    public static void mugeAndJordanDistance (){

        int distanceBetween = 1453;

        for (int i = distanceBetween; i >= 0 ; i--) {
            if(i == distanceBetween/2){
                System.out.println("You're half way there!");
            }else if( i == distanceBetween/4){
                System.out.println("Ooooh, you're getting close");
            }else if (i == distanceBetween - (distanceBetween -10)){
                System.out.println("You're within 10 miles");
            }else if(i == 0){
                System.out.println("You are very very very close, naughty");
            }
        }
    }
}