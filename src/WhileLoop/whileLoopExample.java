package WhileLoop;

public class whileLoopExample {
    public static void main(String[] args) {
        int count =1;
        while (count!=6){
            System.out.println(count);
            count++;
        }
        count=1;
        while (true){
            if (count==5){
                break;
            }
            System.out.println(count);
            count++;
        }
        count=1;
        do {
            System.out.println(count);
            count++;
        }while (count!=7);
 //       int count1 = 0;
//        int number =4;
//        int finishNumber = 20;
//        while (number <= finishNumber){
//            number++;
//            if (!isEven(number)){
//                continue;
//
//            }
//            System.out.println("Even number: " + number);
//        }

        int number =4;
        int finishNumber = 20;
        int evenNumberCount=0;
        while (number <= finishNumber){
            number++;
            if (!isEven(number)){
                continue;
            }




            evenNumberCount++;
            if (evenNumberCount>=5) {
                break;
            }

        }
        System.out.println("Even Number Found: " + evenNumberCount);

    }
    public static boolean isEven(int n){
        if (n % 2==0){
            return true;
        }
        return false;
    }
}
