package mehtodsWithReturn;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {
        int[] arr ={34,5,6,6,3};
        int[] arrr ={34,6,5,6,3,3,5};
        System.out.println(Arrays.toString(addElement(arr,arrr)));

    }
    public static int[] addElement(int[] arr1, int[]arr2){
        int[] newArray=new int[arr1.length];
        for (int i=0; i<newArray.length; i++){
            newArray[i]=arr1[i] + arr2[i];
        }

        return newArray;
    }
}
