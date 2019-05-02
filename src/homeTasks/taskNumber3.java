package homeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class taskNumber3 {
    public static void main(String[] args) {
        ArrayList<Double> nums= new ArrayList<>();
        nums.add(1.32);
        nums.add(2.3);
        nums.add(4.56);
        nums.add(34.4);
        nums.remove(0);
        nums.remove(0);
        System.out.println(nums);
        ArrayList<Integer> nums1= new ArrayList<>();
        nums1.add(34);
        nums1.add(23);
        nums1.add(2);
        nums1.add(1);
        nums1.add(-3);
        nums1.add(-8);

        System.out.println(appendPosSum(nums1));


        ArrayList<String> worldList3 = new ArrayList<>();
        ArrayList<String> worldList4 = new ArrayList<>();
        worldList3.add("car");
        worldList3.add("tank");

        worldList4.add("engine");
        worldList4.add("motor");
        worldList4.add("motor");
        System.out.println(combineAll(worldList3,worldList4));
        worldList4.removeAll(Arrays.asList("motor"));
        System.out.println(worldList4);
        timesTwo(nums1);
        System.out.print(nums1);

        ArrayList<Boolean> words = new ArrayList<>();
        words.add(true);
        words.add(false);
        words.add(false);

        repeatAll(words);
        System.out.println(words);
        ArrayList<String> words1 = new ArrayList<>();
        words1.add("hi");
        words1.add("yo");
        words1.add("boop");








    }
    public static ArrayList<String> combineAll(ArrayList<String> worldList1, ArrayList<String> worldList2){
        ArrayList<String> newWorldList= new ArrayList<>();
        newWorldList.addAll(worldList1);
        newWorldList.addAll(worldList2);
        return newWorldList;
    }
    public static void removeAll(ArrayList<String> wordList1, ArrayList<String> targetword){
        targetword.add("motor");
        for (int i=0; i<wordList1.size(); i++ ){
            if (wordList1.get(i).equals(targetword)){
                wordList1.remove(i--);
            }
        }
    }
    public static void timesTwo(ArrayList<Integer> nums){
        int sum=0;
        for (int x: nums){
            sum+=x;


        }
        System.out.println(sum);
    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> positive = new ArrayList<>();

        return nums;


    }
    public static void repeatAll(ArrayList<Boolean> words){
        words.addAll(words);
    }
    public static void removeEveryOther (ArrayList<String> words1){
        words1.add("hi");
        words1.add("yo");
        words1.add("boop");
        int index = 0;
        int count =0;
        while(words1.size()!=1){
            index=index+1;
            count=count+1;

            String word =words1.get(index);
            if (count==2){
                words1.remove(index-1);
                count=0;
            }
            if (index == words1.size()){
                index=0;
            }
        }


    }
}
