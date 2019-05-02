package veryImportantTopicsForInterview;

import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(factorial(10));
        System.out.println(factorialR(10));
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }





    public static String fact (int number){
        BigInteger fact1 = new BigInteger("1");
        for (int i=1; i<=number; i++){
            fact1=fact1.multiply(new BigInteger(i + ""));
        }
        return fact1.toString();
    }
    public static int factorial (int number){
        int result=1;
        while (number !=0){
            result = result*number;
            number--;
        }
        return result;
    }
    public static int factorialR(int number){
        if (number==0){
            return 1;
        }
        return number*factorialR(number-1);
    }
}
