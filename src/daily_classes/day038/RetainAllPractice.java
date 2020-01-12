package daily_classes.day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1 = " + nums1);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(123, 125, 100, 3000, 2821));

        System.out.println("nums2 = " + nums2);
        nums1.retainAll(nums2);

        System.out.println("nums1 = " + nums1);


    }
}
