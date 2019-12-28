package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int x = scan.nextInt();
        int count = 0;
        for (int i = 1; i <num; i+=x) {
            count++;
        }
        System.out.println(" Numbers -- Divide without / operator: "+count);
    }
}
