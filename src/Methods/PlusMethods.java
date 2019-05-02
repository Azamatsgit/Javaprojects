package Methods;

import java.util.Scanner;

public class PlusMethods {
    public static void main(String[] args) {
      plus();

    }
    public static void plus(){

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter first number " );
        int result = scan.nextInt();
        System.out.println(" Enter second number " );
        result = scan.nextInt();
        System.out.println(result+result);


    }





}
