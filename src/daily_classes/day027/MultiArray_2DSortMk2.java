package daily_classes.day027;

import java.util.Arrays;
import java.util.Scanner;


public class MultiArray_2DSortMk2 {

    public static void main(String[] args) {

        int[][] arr2D   = {{12} , {84, 832 ,6, 3 , 8} , {23, 54, 20, 52, 90, 76} , {12, 8} };
        int temp = 0;
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < arr2D.length; i++) {
            for (int l = 0 ; l < arr2D[i].length; l++) {
// ====================================================================
                for (int m = 0; m < arr2D.length; m++) {
                    for (int n = 0; n < arr2D[m].length ; n++) {
// ====================================================================
                        if(m <= i && n <= l) {
                            m = i;
                            n = l;
                        }
                            if(arr2D[i][l]> arr2D[m][n]){
                            System.out.println("Before modification -->" + Arrays.deepToString(arr2D));
                            System.out.println();

                            System.out.println("temp   =   arr2D[" + i +"][" + l + "] (" + arr2D[i][l] + ")");
                                temp = arr2D[i][l];
                            System.out.println("arr2D[" + i + "][" + l + "]   =   arr2D[" + m +"][" + n + "] (" + arr2D[m][n] + ")");
                                arr2D[i][l] = arr2D[m][n];
                            System.out.println("arr2D[" + m + "][" + n + "]   =   temp (" + temp + ")");
                                arr2D[m][n] = temp;
                            System.out.println(arr2D[i][l] + " and " + arr2D[m][n] + " have been swapped");

                            System.out.println();
                            System.out.println("After modification -->" + Arrays.deepToString(arr2D));
                            System.out.println("====================================================================");
                            scan.nextLine();



                        }
                    }
                }
            }

        }
        System.out.println(Arrays.deepToString(arr2D));
    }
}
