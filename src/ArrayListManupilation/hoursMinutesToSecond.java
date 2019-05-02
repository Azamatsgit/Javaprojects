package ArrayListManupilation;

import java.util.Arrays;

public class hoursMinutesToSecond {
    public static void main(String[] args) {

        int [] arrr = {24,5,6,56,656};
        int temp=0;
        for (int i=0; i< arrr.length /2; i++){
            temp = arrr[i];
            arrr[i]=arrr[arrr.length-i-1];
            arrr[arrr.length-i-1]=temp;
            System.out.println(Arrays.toString(arrr));

        }






    }
}
