package multiDArrays;

public class binaryTask {
    public static void main(String[] args) {
        int number, i=0;
        int[] binary=new int[100];
        number=1;
        while (number!=0){
            binary[i]=number%2;
            number=number/2;
            i++;

        }
        System.out.println("Binary value is: " );
        for (int j=i-1;j>=0;j--){
            System.out.print(" "+ binary[j]);
        }
    }
}
