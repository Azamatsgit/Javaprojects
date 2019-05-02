package multiDArrays;

public class uniqNumberTask {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 3, 4,23};
        int result=0;
        for (int i: nums){
            result^=i;
        }
        System.out.println(result);
    }
}