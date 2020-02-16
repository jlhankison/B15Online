package daily_classes.day059;

public class ThrowingExceptionProgramatically {

    public static void main(String[] args) {

        NullPointerException e1 = new NullPointerException("Hello buddy!");

        System.out.println(e1.getMessage());

        String x = "y";

        throw e1;



    }
}
