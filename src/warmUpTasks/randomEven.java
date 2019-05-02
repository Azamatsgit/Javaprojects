package warmUpTasks;

import java.util.Random;

public class randomEven {
    public static void main(String[] args) {
        Random random = new Random(9);
        int even = random.nextInt();

        if (even % 2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }
}
