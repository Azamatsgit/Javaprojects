package ClassInJava;

import java.util.Arrays;

public class arraysEquals {
    public static void main(String[] args) {
        int[] arr1={56,90,67,45,76};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = arr1;
        System.out.println(Arrays.toString(arr2));
        System.out.println("==============================================");

        System.out.println(arr1==arr2);

        System.out.println("============================================");
        System.out.println(Arrays.equals(arr1,arr2));

        int[] arr3={56,90,67,45,76};
        System.out.println(Arrays.equals(arr1,arr3));
        System.out.println("=============================================");
        String str1= new String("hello");
        String str2= new String("hello");
        System.out.println(str1.equals(str2));
    }
}
