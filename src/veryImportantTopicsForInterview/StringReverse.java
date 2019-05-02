package veryImportantTopicsForInterview;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int reverse=str.length();
        for (int i=str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
            //System.out.print(str.charAt(i));
        }
        System.out.println(reverse);
    }
}
