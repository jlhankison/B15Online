package daily_classes.day044;

public class TrainAction {

    public static void main(String[] args) {

        Train bnsf = new Train();

        bnsf.make = "BNSF";

        bnsf.setYear(2003);

        bnsf.carCount = 35;

        bnsf.start();

        bnsf.makeSound();

        bnsf.goForward();

        System.out.println("bnsf.getYear() = " + bnsf.getYear());


    }
}
