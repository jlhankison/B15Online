package daily_classes.day028;

import java.util.Arrays;

public class MultiArray_3DSort {
    public static void main(String[] args) {


        int temp = 0;
        int [][][]  arr3D = {
                {
                        {3,6,2,39,68},
                        {7,29,69,4,21},
                        {193,3,26,4,75}
                },
                {
                        {385,2,184},
                        {53,12,594,38,1845},
                        {190,38,2,185,9},
                        {1}

                }
        };

        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
//=====================================================================
                    for (int l = 0; l < arr3D.length; l++) {
                        for (int m = 0; m < arr3D[l].length; m++) {
                            for (int n = 0; n < arr3D[l][m].length; n++) {
                                if(l <= i && m <= j && n <= k){
                                    l = i;
                                    m = j;
                                    n = k;
                                }
                                if (arr3D[i][j][k] > arr3D[l][m][n]){
                                    System.out.println(Arrays.deepToString(arr3D));
                                    System.out.println("Standing comparator: arr3D[" + i + "][" + j + "][" + k + "] = " + arr3D[i][j][k]);
                                    System.out.println("Floating comparison: arr3D[" + l + "][" + m + "][" + n + "] = "  + arr3D[l][m][n]);
                                    System.out.println(arr3D[i][j][k] + " > " + arr3D[l][m][n]);

                                    temp = arr3D[i][j][k];
                                    arr3D[i][j][k] = arr3D[l][m][n];
                                    arr3D[l][m][n] = temp;

                                    System.out.println();

                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(arr3D));
    }
}
