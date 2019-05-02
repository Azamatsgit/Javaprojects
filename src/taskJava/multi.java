package taskJava;

public class multi {
    public static void main(String[] args) {
        String[][] nums = {{"a","d","2","4"},{"1","2","3","4"},{"2","1","q","0"}};
        //String [][] a = Arrays.toString(nums).replaceAll("([a-z])",'0');

        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length;j++){
                if(i%2 ==0)
                    nums[i][j] = "0";
                else
                    nums[i][j] = "1";

                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }


    }

}