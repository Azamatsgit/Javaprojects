package ClassInJava;

import java.util.Arrays;

public class sortMethod {
    public static void main(String[] args) {
        int[] nums = {45, 56, 3, -7, 32, 7, 3};

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        Arrays.sort(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}