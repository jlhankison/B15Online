package repl_tasks;

public class Task188 {

    public static int findMax (int[] intArr){
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] > max){
                max = intArr[i];
            }
        }
        return max;
    }
    public static double findMax (double[] doubleArr){
        double max = doubleArr[0];
        for (int i = 0; i < doubleArr.length; i++) {
            if(doubleArr[i] > max){
                max = doubleArr[i];
            }
        }
        return max;
    }

}
