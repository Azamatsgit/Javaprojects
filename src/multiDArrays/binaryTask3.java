package multiDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class binaryTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] binary=new int[8];

        for (int i= binary.length-1; i>=0;i--){
            binary[i]=number%2;
            number/=2;
        }
        System.out.println(Arrays.toString(binary));
    }
}
