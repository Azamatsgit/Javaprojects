package ArraysRecap;

public class recap1 {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i]=i*10;
        }
        printArray(myIntArray);

    }
    public static void printArray (int [] array){
        for (int i=0; i<array.length; i++){
            System.out.println("element: " + i+ "value is: " + array[i]);
        }
    }
}
