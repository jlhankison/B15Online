package daily_classes.day035;

public class Parsing {
    public static void main(String[] args) {


        String num = "600,132";

        String[] nums = num.split(",");

        int total = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    }
}
