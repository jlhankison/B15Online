package Methods;

public class Build3Digit {

    public static int return3Digit ( int x, int y, int z){

        x *= 100;
        y*= 10;

        return x + y + z;
    }
}
