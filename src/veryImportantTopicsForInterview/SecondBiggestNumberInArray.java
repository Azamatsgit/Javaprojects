package veryImportantTopicsForInterview;

public class SecondBiggestNumberInArray {
    public static void main(String[] args)
    {
        int[] nums = {99, 54, 20,5, 6, 7, 8,9};
        int temp;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] < nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Second largest element is: " +nums[1]);
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+ " ");
        }

    }
}
