package daily_classes.day019;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("what is your starting and ending speed?");
        int start = scan.nextInt(),
                end = scan.nextInt();

        if (start < end) {
            for (; start<=end; start++  )
                System.out.print(start + ", ");
        }else if (start > end) {
            for (; start >= end; start--)
                System.out.print(start + ", ");
        }else{
            System.out.println("You are already going the speed you want");
        }

    }
}
