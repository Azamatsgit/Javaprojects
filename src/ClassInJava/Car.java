package ClassInJava;

public class Car {

    public static void main(String[] args) {
        boolean f = false;
        do {
            if (!f) {
                f = true;
                System.out.print("1");
            }
        }
        while (!f);
        System.out.println("2");


    }


}
