package ArraysRecap;

import java.util.Arrays;

public class recap4  {
    public static void main(String[] args) {
        int[] myIntArray = new int [5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myAnotherArray= " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        myIntArray[1]=23;
        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change myAnotherArray= " + Arrays.toString(anotherArray));

        anotherArray=new int[]{12,34,5,55};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify myAnotherArray= " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[0]=2;

    }
}
