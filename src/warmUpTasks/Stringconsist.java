package warmUpTasks;

import java.util.Scanner;

public class Stringconsist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean hasMultipleWords;

        if (str.equals("")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
