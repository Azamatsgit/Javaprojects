package veryImportantTopicsForInterview;

public class SecondSmallestNumberInArray {
    public static void main(String[] args) {

        int[] nums = {45,6,67,5,56,48};
        int temp;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] < nums[j]){
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(nums[1]);

    }

}
