package ArrayListManupilation;

import java.util.*;

public class methodsWithArrayList {
    public static void main(String[] args) {
         List<Integer> num1= new ArrayList<>();
         num1.add(100);
         num1.add(200);
         List<Integer>num2= new ArrayList<>();
         num2.add(250);
         int result = sumList(num1);
        //System.out.println(result);
        //System.out.println(sumList(num1));
        System.out.println(sumList2(num1,num2));
        System.out.println(builIntList(5));

    }
    public static int sumList(List<Integer> nums){
        int sum=0;
        for (int i=0; i<nums.size(); i++){
            sum+=nums.get(i);

        }
    return sum;
    }
    public static int sumList2(List<Integer> nums, List<Integer> nums2){
        int sum1 =0;
        for (int x: nums){
            sum1+=x;
        }
        for (int w: nums2){
            sum1+=w;
        }
        return sum1;
    }
    // Create method that returns an ArrayList of integer
    //Method Name buildIntList
    //Return type: ArrayList Integers
    //Args int
    //This method an int and creates an arrayList with that many random
    //Numbers between 0-100 and returns it
    public static List<Integer> builIntList(int count){

        Random random = new Random(20);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i=1; i<=count; i++){
            list1.add(random.nextInt(101));
        }
        return list1;

    }


}
