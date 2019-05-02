package warmUpTasks;

import java.util.Scanner;

public class isCampusOpen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(24);

        if (n >=8 && n <24){
            System.out.println("Campus open:"+true);
        }else {
            System.out.println("Campus closed: " +false);

        }
    }
}
