package Methods;

import java.util.Scanner;

public class warmUp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String endUp = scanner.nextLine();

        if (endUp.length() >=3) {
            System.out.println(endUp.substring(0, endUp.length() - 3)
                    + endUp.substring(endUp.length() - 3).toUpperCase());

        }
    }
}
