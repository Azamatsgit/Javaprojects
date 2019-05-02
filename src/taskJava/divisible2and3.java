package taskJava;

import java.util.Scanner;

public class divisible2and3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String num1 = scanner.nextLine();
        int num=12;

        for (int i=0; i <num1.length(); i++){
            num = num + num1.charAt(i) -'0';
        }if (num % 2==0 && num % 3==0 ){
            System.out.println("Number divided by three and Two");
        }else {
            System.out.println("Number is invalid");
        }
    }
}
