package encampsulation;

import java.math.BigInteger;

public class javaSetterMain {
    public static void main(String[] args) {

        javaGetterAndSetter emp = new javaGetterAndSetter();
        emp.setName("Tom Peter");
        emp.getAge();
        System.out.println(fact(34));
    }
    public static String fact (int number){
        BigInteger fact1 = new BigInteger("1");
        for (int i=1; i<=number; i++){
            fact1=fact1.multiply(new BigInteger(i + ""));
        }
        return fact1.toString();
    }
}
