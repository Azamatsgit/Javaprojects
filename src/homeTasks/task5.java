package homeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task5 {
    public static void main(String[] args) {
        ArrayList<String> swapPosition = new ArrayList<>();
        swapPosition.add("One");
        swapPosition.add("Two");
        swapPosition.add("Three");
        System.out.println(swapPosition);


        Collections.swap(swapPosition,0,2);

        System.out.println(swapPosition);


        String[] arrStr ={"f","o","o"};
        String[] arrStr1 ={"b","a","r"};
        ArrayList<String> combineRs = new ArrayList<>(Arrays.asList(arrStr));
        combineRs.addAll(Arrays.asList(arrStr1));


        System.out.println(combinRs1(arrStr,arrStr1));
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.add(1);
        System.out.println(remove(nums));



        int temp = nums.get(0);
        nums.set(0,nums.get(nums.size()-1));
        nums.set(nums.size()-1,temp);
        System.out.println(nums);



    }
    public static String combinRs1 (String [] str1, String[] str2){
        String ret="";
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(str1));
        list1.addAll(Arrays.asList(str2));

        for (String word: list1){
            ret+=word;
        }
        return ret;
    }
    public static ArrayList<Integer> twoTimes (ArrayList<Integer> nums){
        ArrayList<Integer> nums1 = new ArrayList<>();

        for (int x: nums){
            nums1.add(x);
            nums1.add(x);

        }
        return nums1;

    }
    public static ArrayList<Integer> remove(ArrayList<Integer> aList){
        for (int i=0; i<aList.size(); i++){
            for (int j=i+1; j<aList.size(); j++){
                if (aList.get(i).equals(aList.get(j))){
                    aList.remove(j);
                    j--;
                }
            }
        }
        return aList;
    }
}
