package Cunstructor;

public class CalcTest {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.plus(10);
        System.out.println(c);
        c.plus(4).plus(6);
        System.out.println(c.getResult());
    }
}
