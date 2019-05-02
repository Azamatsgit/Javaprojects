package warmUpTasks;

import java.util.Scanner;

public class programmSent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the massage!");
        String str = scanner.nextLine();
        if (str.length() >=15){
            System.out.println("Message sent: "+ true);
        }else{
            System.out.println("Massage is not sent: " + false);
        }
    }
}
