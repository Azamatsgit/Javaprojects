package veryImportantTopicsForInterview;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=scanner.nextInt();
        int temp=0;
        for (int i=2; i<=num-1;i++){
            if (num % i==0){
                temp=temp+1;

            }
        }
        if (temp==0){
            System.out.println(num+" is prime number");
        }else {
            System.out.println(num+ " is not prime");
        }
    }
}
