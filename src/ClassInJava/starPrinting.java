package ClassInJava;

public class starPrinting {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int b = 1; b <= (5 - i); b++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int l = 5; l >= 1; l--) {
            for (int x = 1; x <= l; x++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= l; z++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}