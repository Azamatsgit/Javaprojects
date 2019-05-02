package mehtodsWithReturn;

public class isSorted {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,4,7};
        System.out.println(isArraysorted(arr1));

    }
    public static boolean isArraysorted(int[] array){
        boolean result = true;
        if (array!= null && array.length>0) {
            int prevNumber = array[0];
            for (int i=1; i < array.length; i++){
                int currentNumber = array[i];

                if (currentNumber <prevNumber){
                    result = false;
                    break;
                }
                prevNumber=currentNumber;
            }

        }
        else {
            result=false;
        }
        return result;
    }
}
