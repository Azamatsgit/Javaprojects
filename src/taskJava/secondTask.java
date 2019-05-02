package taskJava;

public class secondTask {
    public static void main(String[] args) {
        int[][] nums = {{2,2,1,3,4,5},{5,2,3,3,4,5},{3,2,3,1,4,5}};
        //String [][] a = Arrays.toString(nums).replaceAll("([a-z])",'0');
        int count =0;
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length-1;j++){
                if (nums[i][j] == nums[i][j+1])
                    count++;


            }
        }
        System.out.println(count);
    }
}
