package office_hour;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {

        int num =53;
        int divisor = -5;
        int count =0;
        for(int y = 1 ; y<num ; y++){
            if (y%divisor==0){
                count++;
            }
        }
        System.out.println(count);
//count = nun/2
    }
}
