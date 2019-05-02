package ArraysPresintation;

import java.util.Arrays;

public class addTwoArray {

    public static void main(String[] args) {
        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };
        System.out.println(Arrays.toString(add(even,odd)));



    }
    public static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length : second.length;


        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }
        return result; }


}
