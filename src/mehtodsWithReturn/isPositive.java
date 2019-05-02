package mehtodsWithReturn;

import java.util.Arrays;

public class isPositive {
    public static void main(String[] args) {
        //isPositive();
       int[] n = new int[]{1,2,3,4,};
        System.out.println(Arrays.toString(n));
        int[] nums;
        nums = reverseArray(n);
        System.out.println(Arrays.toString(nums));

    }


    public static int[] reverseArray(int[] input){
        int[] reverse = new int[input.length];

        for (int i=0, j = reverse.length-1; i< input.length; i++, j--){
            reverse[j] = input[i];

        }
        return reverse;

    }
}
