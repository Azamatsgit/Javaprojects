package multiDArrays;

public class resizingArray {
    public static void main(String[] args) {
        int[] baseData= new int[10];

        int[] original = baseData;
        baseData = new int[12];
        for (int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }
}
