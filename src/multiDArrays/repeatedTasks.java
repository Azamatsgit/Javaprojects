package multiDArrays;

public class repeatedTasks {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,3,4};

        for (int i=0; i<nums.length; i++) {
            int currentNum = nums[i];
            boolean duplicate = false;

            for (int j = 0; j < nums.length; j++) {
                if (currentNum==nums[i] && j != i) {
                    duplicate = true;
                    break;
                }
            }
        if (duplicate==false){
            System.out.println(currentNum);
        }
        }
    }
}
