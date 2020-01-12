package daily_classes.day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEqualityCheck {

    public static void main(String[] args) {


        List<Integer> nums1 = new ArrayList<>(Arrays.asList(123, 125, 100, 3000, 2821));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(123, 125, 100, 3000, 2821));

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(123, 3000, 100, 125, 2821));

        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);
        System.out.println("nums3 = " + nums3);
        System.out.println("nums1.equals(nums2) = " + nums1.equals(nums2));
        System.out.println("nums2.equals(nums3) = " + nums1.equals(nums2));
    }
}
