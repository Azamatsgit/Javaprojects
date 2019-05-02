package ArrayListManupilation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(299);
        nums.add(1);
        nums.add(22);
        nums.add(4);

        System.out.println(nums);

        nums.set(0,1000);

        System.out.println(nums);
        nums.set(1,nums.get(1)*2);
        System.out.println(nums);
        nums.set(1,nums.get(1)*2);
        System.out.println(nums);

        // find the position of 300 and make it three

        int pos = nums.indexOf(300);
        nums.set(nums.indexOf(22),2);

        System.out.println(nums);

    }
}
