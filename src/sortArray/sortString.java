package sortArray;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        String[] names ={"Said","Azamat","Asel"};
        Arrays.sort(names);
        for (String name: names) {
            System.out.print(name + " ");
        }
        System.out.println();
        char[] charArray = {'c','C','D','A','2'};
        Arrays.sort(charArray);//
        for (char ch: charArray){
            System.out.print(ch+ " ");
        }


    }
}
