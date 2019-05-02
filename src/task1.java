public class task1 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int number=1; number <=1000; number++){
            if ((number % 3==0) && (number % 5==0)) {
                count++;
                sum  += number;
                System.out.println("Found Number: " + number);
            }
            if (count==5){
                break;
            }
        }
        System.out.println(sumOdd(1,100));


    }
    public static void next3( int n){
        for (int i=0; i<3; i++){
            n+=1;
            System.out.println(n +" ");
        }

    }
    public static boolean isOdd(int n){
        if (n>0 || n%2==0){
            return true;

        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if (start>0 && end >0 && end>=start){
            for (int i=start;i<=end; i++){
                if (isOdd(i)){
                    sum+=i;

                }
            }
            return sum;
        }
        return -1;
    }
}
