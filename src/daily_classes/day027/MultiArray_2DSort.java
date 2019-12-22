package daily_classes.day027;

import java.util.Arrays;
import java.util.Scanner;


public class MultiArray_2DSort {

    public static void main(String[] args) {

        int[][] arr2D   = {{12, 78, 5 , 1, 53} , {84, 832 ,6, 3 , 8} , {23, 54, 20, 52, 90}};
        int temp = 0;
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < arr2D.length; i++) {
            for (int l = 0 ; l < arr2D.length; l++) {
// ====================================================================
                for (int m = 0; m < arr2D[i].length; m++) {
                    for (int n = 0; n < arr2D[l].length ; n++) {
// ====================================================================
                        if(arr2D[i][m]> arr2D[l][n]){
                                    System.out.println("Before modification -->" + Arrays.deepToString(arr2D));
                                    System.out.println();

                                    System.out.println("temp   =   arr2D[" + i +"][" + m + "] (" + arr2D[i][m] + ")");
                            temp = arr2D[i][m];
                                    System.out.println("arr2D[" + i + "][" + m + "]   =   arr2D[" + l +"][" + n + "] (" + arr2D[l][n] + ")");
                            arr2D[i][m] = arr2D[l][n];
                                    System.out.println("arr2D[" + l + "][" + n + "]   =   temp (" + temp + ")");
                            arr2D[l][n] = temp;
                                    System.out.println(arr2D[i][m] + " and " + arr2D[l][n] + " have been swapped");

                                    System.out.println();
                                    System.out.println("After modification -->" + Arrays.deepToString(arr2D));
                                    System.out.println("====================================================================");
//                            scan.nextLine();

                        }
                    }
                }
            }

        }
        System.out.println(Arrays.deepToString(arr2D));
    }
}
