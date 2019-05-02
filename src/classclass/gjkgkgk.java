package classclass;

import java.util.Arrays;

public class gjkgkgk {


    public static void main(String[] args) {

        // Get the Array
        int intArr[] = {10, 20, 15, 22, 35};
        int n = 4;

        // To print the elements in one line
        System.out.println("Integer Array: "
                + Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOfRange:\n");

        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(intArr, 1, 3)));



        int twoD[][] = new int[4][3];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];


        int[] array = {1, 4, 3, 6};
        int what = 0;


        for (int index = 0; index < array.length; index++) {
            what = what + array[index];
        }
        System.out.println(what);


    }
}

