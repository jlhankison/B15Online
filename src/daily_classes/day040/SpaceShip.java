package daily_classes.day040;

public class SpaceShip {

    String name;
    String currentDirection = "up";
    int xCoordinate;
    int yCoordinate;

    /**
     * This toString method returns the current status of your space ship.
     * It's NAME, COORDINATES, and DIRECTION represent it's status
     * @return
     */
    public String toString(){
        String str = "Ship name: [ " + name + " ]\n" +
                "Coordinates: " +
                "[ X: " + xCoordinate + " : " +
                "Y: " + yCoordinate + " ]\n" +
                "Current direction: " +
                "[ " + currentDirection + " ]";
        return str;
    }

    public void resetShipPosition (){
        xCoordinate = 0;
        yCoordinate = 0;
        currentDirection = "up";
        System.out.println(toString());
    }

    /**
     * This method will move the space ship in the direction the ship is pointed by the value of int distance
     * the method will provide a visual component to the ship so that you can see where and how far it traveled
     * @param distance the number of times the ship will move forward.
     */
    public void moveForward (int distance){
        String moveLines = "";
        switch (currentDirection){
            case "up" :
                xCoordinate += distance;
                moveLines = "|";
                break;
            case "right" :
                yCoordinate += distance;
                moveLines = "--";
                break;
            case "down" :
                xCoordinate -= distance;
                moveLines = "|";
                break;
            case "left" :
                yCoordinate -= distance;
                moveLines = "--";
                break;
            default:
                break;
        }
        if(currentDirection.equals("left") || currentDirection.equalsIgnoreCase("right")){
            for (int i = 0; i < distance - 1; i++) {
                moveLines += moveLines;
            }
        }else{
            for (int i = 0; i < distance - 1; i++) {
                moveLines += "\n" + moveLines;
            }
        }
        switch (currentDirection) {
            case "up":
                System.out.println(shipVisual());
                System.out.println(moveLines);
                break;
            case "left":
                System.out.print(shipVisual());
                System.out.println(moveLines);
                break;
            case "right":
                System.out.print(moveLines);
                System.out.println(shipVisual());
                break;
            case "down":
                System.out.println(moveLines);
                System.out.println(shipVisual());
                break;
            default:
                break;
        }

            System.out.println("Coordinates: " +
                    "[ X: " + xCoordinate + " : " +
                    "Y: " + yCoordinate + " ]");
        }

    /**
     * this method will move the ship forward 1. There is no parameter in this method.
     */
    public void moveForward (){
        moveForward(1);
    }

    /**
     * This method changes the direction the ship is facing so that you can move forward in a different direction
     * @param direction is a parameter given by the user to indicate the desired direction of the ship
     */
    public void turn (String direction){
        if (!direction.equalsIgnoreCase("up") &&
                !direction.equalsIgnoreCase("down") &&
                !direction.equalsIgnoreCase("left") &&
                !direction.equalsIgnoreCase("right") ){
            System.out.println("Invalid direction: Choose 'up', 'down', 'left', or 'right'.");
        }else{
            currentDirection = direction;
        }
        System.out.println(shipVisual());
    }

    /**
     * This method provides a current visual of the selected ship.
     * @return type String : returns a String meant to represent the direction of the ship
     */
    public String shipVisual(){
        switch (currentDirection){
            case "up" :
                return "A";
            case "down" :
                return "V";
            case "right" :
                return ">";
            case "left" :
                return "<";
            default:
                return "Invalid direction" ;
        }
    }

}
