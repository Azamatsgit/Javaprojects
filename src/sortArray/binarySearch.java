package sortArray;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        String[] words ={"tomato","wooden spoon","pizza","cake"};
//        int idex = -1;
//
//       for (int x=0; x < words.length; x++){
//           if(words[x].equals("pizza")){
//               idex = x;
//               break;
//           }
//       }
       // System.out.println(idex);

        // First of all sort the Array
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.binarySearch(words, "wooden spoon"));


    }
}
