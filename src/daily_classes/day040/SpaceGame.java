package daily_classes.day040;

public class SpaceGame {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();

        s1.name = "Serenity";

        s1.moveForward(2);
        s1.turn("right");
        s1.moveForward(2);
        s1.turn("down");
        s1.moveForward(2);
        s1.turn("left");
        s1.moveForward(2);
    }
}
