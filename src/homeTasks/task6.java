package homeTasks;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {

        int[] arr= {12,4,5,65,6,33,};




        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];

        }
        System.out.println(sum);


        for (int i=arr.length-1; i>=0; i--){


            System.out.print(arr[i]+" ");


        }
        System.out.println();
        String reverse = "java";
        String rev = "";
        for (int i=reverse.length()-1; i>=0; i--){
            rev=rev+reverse.charAt(i);
        }
        System.out.println(rev);

        int[] arr1 = new int [10];

        for (int i=0; i<arr1.length; i++){
            arr1[i]+=i;
        }
        System.out.println(Arrays.toString(arr1));

        int[] nums= {12,4,5,65,6,33};

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){

                if (nums[i] > nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }

        }
        System.out.println(nums[1]);




    }
}
