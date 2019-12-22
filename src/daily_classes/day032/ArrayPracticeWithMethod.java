package daily_classes.day032;

public class ArrayPracticeWithMethod {

    public static void arrayPrinter (int [] nums){

        for (int num :
                nums){
            System.out.print(num);
        }


    }


    public static void main(String[] args) {

        int[] nums = {34, 3, 1, 343,6,8,43};

        arrayPrinter(nums);
    }
}
