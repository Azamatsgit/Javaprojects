package sortArray;

import java.util.Arrays;

public class arrayEquals {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        int[] c = {1,2,3,4};
        int[] d = {1,2,4,3};
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(c,d));

    // Use operators to compare instead of equals method
    }
}
