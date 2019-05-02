package mehtodsWithReturn;

import java.util.Scanner;

public class warmUpTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three number");
        int n = scanner.nextInt();

        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        if (n>n1 && n>n2){
            System.out.println(n);

        }else if (n1>=n && n1 >=n2){
            System.out.println(n1);

        }else {
            System.out.println(n2);
        }
    }
}
