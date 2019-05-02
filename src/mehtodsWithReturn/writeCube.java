package mehtodsWithReturn;

public class writeCube {
    public static void main(String[] args) {


        sign(-1);



    }
    public static void getCube(int n){
        //n=scanner.nextInt();
         n=n*n*n;
        System.out.println(n);
    }
    public static void sign(int number){
        if (number >0){
            System.out.println("1");
        }else if(number <0){
            System.out.println("-1");
        }else {
            System.out.println("0");
        }
    }
    public static void plus_minus(int[] nums) {
        nums = new int[]{1, 2, 55, -9, -2, 0};

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int x : nums) {
            if (x > 0) {
                x += positive;
            } else if (x < 0) {
                negative += x;
            }
            if (x == 0) {
                zeros += x;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);

    }

}




