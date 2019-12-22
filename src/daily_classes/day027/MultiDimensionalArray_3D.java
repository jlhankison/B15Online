package daily_classes.day027;

import java.util.Arrays;

public class MultiDimensionalArray_3D {


    public static void main(String[] args) {

        int x = 0,
                y = 0,
                temp = 0;


        int[][][]  arr3D = { { {1,2,3} , {8,9,10} , {53,54,55} } , { {7,6,5} , {5,4,3} , {98,97,96} } };

        for (int[][] arr2D : arr3D) {
            for( int[] arr1D : arr2D){
                for(int eachInt : arr1D){
                    System.out.print(eachInt + " ");
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(arr3D));
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    for (int l = k; l < arr3D[i][j].length; l++) {

                        if(arr3D[i][j][k] > arr3D[i][j][l]){
                            temp = arr3D[i][j][k];
                            arr3D[i][j][k] = arr3D[i][j][l];
                            arr3D[i][j][l] = temp;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(arr3D));
    }
}
