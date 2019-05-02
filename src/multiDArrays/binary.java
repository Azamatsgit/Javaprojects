package multiDArrays;

public class binary {
    public static void main(String[] args) {
        int dec = 2;
        String str1 = Integer.toBinaryString(dec);
        // System.out.println(str1);

        char[] binary = str1.toCharArray();

        for(int i = 0; i < binary.length; i++) {
            System.out.print(binary[i] + " ");


        }
    }
}
