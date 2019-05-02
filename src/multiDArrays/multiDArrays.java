package multiDArrays;

public class multiDArrays {
    public static void main(String[] args) {

        int[][] nums= new int[2][3];

        nums[0][0]=10;
        nums[0][1]=20;
        nums[0][2]=30;
        nums[1][0]=40;
        nums[1][1]=50;
        nums[1][2]=60;



        System.out.println(nums[0][0]);
        //reading length from 20 array
        //find out how 1D arrays are in 20 array
        System.out.println("Number of array: " + nums.length);
        System.out.println("Number of value in first array: " + nums[0].length);
        System.out.println("Number of value in second array: " + nums[1].length);
        int[][]nums2={{10,20,30},{40,50,60},{70,80}};

        System.out.println(nums2.length);
        System.out.println(nums2[0].length);
        System.out.println(nums2[2].length);

    }
}
